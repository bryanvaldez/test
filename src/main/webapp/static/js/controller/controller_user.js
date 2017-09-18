'use strict';

angular.module('app').controller('UserController', ['$scope','UserService', function($scope, UserService){
    var self = this;
    self.user = {id:null,usuario:'',apellidoPaterno:'',apellidoMaterno:'',nombre:'',clave:'',estado:null,ubigeo:'',fechaInicial:null,fechFinal:null,perfil:null};
    self.users = [];
    self.ambits = [];
    
    self.submit = submit;
    self.edit = edit;
    self.remove = remove;
    self.reset = reset;

    fetchAllUsers();
    
    function fetchAllUsers(){
        UserService.fetchAllUsers()
            .then(
            function(d){                
                self.ambits = d;
            },
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    }
    
    function createUsers(){
        UserService.createUsers()
            .then(
            fetchAllUsers,
            function(errResponse){
                console.error('Error while creating User');
            }
        );
    }    
    
    function updateUsers(user, id){
        UserService.updateUsers(user, id)
            .then(
            fetchAllUsers,
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    }
    
    function deleteUsers(){
        UserService.deleteUsers()
            .then(
            function(d){
                self.users = d;
            },
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    }
    
    function submit(){
        if(self.user.id === null){
            createUsers(self.user);
        }else{
            updateUser(self.user, self.user.id);
        }
        reset();
    }
    
    function edit(id){
        for (var i= 0; i<self.users.length; i++) {
            if(self.users[i].id === id){
                self.user = angular.copy(self.users[i]);
                break;
            }
        }
    }
    
    function remove(id){
        if(self.user.id === id){
            reset();
        }
        deleteUsers(id);
    }
    
    function reset(){
        self.user = {id:null,usuario:'',apellidoPaterno:'',apellidoMaterno:'',nombre:'',clave:'',estado:null,ubigeo:'',fechaInicial:null,fechFinal:null,perfil:null};
        $scope.userForm.$setPristine();
    }
        
}]);