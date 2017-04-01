var exec = require('cordova/exec');

var Permission = {
    requestPermission:function(success,error){
    	exec(success,error,"Permission","requestPermission", []);
    }

};

module.exports = Permission;