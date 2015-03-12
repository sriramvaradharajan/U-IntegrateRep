angular.module('uIntegrate' , [])
.controller('studentprofilecontroller',function studentprofilecontroller($scope,$http){
	
	//Fetching the list of Student Profiles.
	$http.get('http://localhost:8080/U-Integrate/service/StudentProfile/GetProfiles')
	.success(function(data){
		$scope.studentProfiles = data;
	})
	.error(function(data , status , headers , config){
		$scope.errorMessage("Couldn't load Student Profiles. "+ status);
	});
});