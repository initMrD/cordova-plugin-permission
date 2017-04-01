var exec = require('cordova/exec');

var Permission = {
    requestPermission:function(permission,success,error){
    	exec(success,error,"Permission","requestPermission", [permission]);
    }

};

module.exports = Permission;