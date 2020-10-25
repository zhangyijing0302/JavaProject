package cn.sunline.edsp.adp.boot;

import cn.sunline.adp.boot.cedar.CedarMain;

public class AcctApplication {
    public static void main(String[] args) {
        System.setProperty("ltts.vmid", "acct");
        System.setProperty("ltts.home", System.getProperty("user.dir"));
        System.setProperty("ltts.log.home", "logs");
        CedarMain.main(args);	
    }
}

