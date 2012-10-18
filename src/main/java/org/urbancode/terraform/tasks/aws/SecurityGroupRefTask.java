package org.urbancode.terraform.tasks.aws;

import org.apache.log4j.Logger;
import org.urbancode.terraform.tasks.common.TerraformContext;

import com.urbancode.x2o.tasks.SubTask;

public abstract class SecurityGroupRefTask extends SubTask {

    //**********************************************************************************************
    // CLASS
    //**********************************************************************************************
    final static private Logger log = Logger.getLogger(VpcSecurityGroupRefTask.class);

    //**********************************************************************************************
    // INSTANCE
    //**********************************************************************************************

    protected TerraformContext context;
    protected String groupName;
    protected SecurityGroupTask ref;

    //----------------------------------------------------------------------------------------------
    public SecurityGroupRefTask(TerraformContext context) {
        this.context = context;
    }

    //----------------------------------------------------------------------------------------------
    public void setSecurityGroupName(String groupName) {
        this.groupName = groupName;
    }

    //----------------------------------------------------------------------------------------------
    public String getSecurityGroupName() {
        return groupName;
    }

    //----------------------------------------------------------------------------------------------
    // TODO return generic type
    abstract public SecurityGroupTask fetchSecurityGroup();

}
