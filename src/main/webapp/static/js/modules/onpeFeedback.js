(function(window,angular,undefined) {

'use strict';

    var lfNgMdFileinput = angular.module('OnpeFeedback', []);

    lfNgMdFileinput.directive("svg", function () {
        var directive = {
            templateUrl: 'http://localhost:8080/SRS/feedback/'
        }
        return directive;
    });


})(window,window.angular);
