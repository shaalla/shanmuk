/**
 * Created by sreeram on 3/17/16.
 */
describe('myController', function () {
  beforeEach(module('ArrayExample'));

  var $controller;

  beforeEach(inject(function(_$controller_){
    // The injector unwraps the underscores (_) from around the parameter names when matching
    $controller = _$controller_;
  }));

  describe('fullName', function() {
    it('Tests the Full name feature of the application', function() {
      var $scope = {};
      var controller = $controller('myController', { $scope: $scope });
      var firstname = 'shanmuk';
      var lastname = 'shanmuk';
      expect($scope.fullName(firstname, lastname)).toEqual('shanmuk shanmuk');   // succeeds
      //expect($scope.fullName('Tony' , 'Willams')).toEqual('John Doe');    // fails

    });
  });
});
