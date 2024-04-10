package proxy.Program;

import proxy.autobuz.Autobuz;
import proxy.autobuz.AutobuzAbstract;
import proxy.autobuz.ProxyAutobuz;
import proxy.autobuz.ProxyAutobuzProtest;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        AutobuzAbstract autobuz=new Autobuz(1,123,"Calin");
        AutobuzAbstract autobuz1=new Autobuz(0,123,"Calin");

        autobuz.opresteAutobuzInStatie("Piata Romana");
        AutobuzAbstract autobuzProxy=new ProxyAutobuz(autobuz1);
        autobuzProxy.opresteAutobuzInStatie("Romana");
        List<String> statiiInterzise=new ArrayList<>();
        statiiInterzise.add("Romana");
        statiiInterzise.add("Mihai");
        statiiInterzise.add("Unviersitate");

        AutobuzAbstract autobuzProxyProtest=new ProxyAutobuzProtest(statiiInterzise,autobuz1);
        autobuzProxyProtest.opresteAutobuzInStatie("Romana");
        autobuzProxyProtest.opresteAutobuzInStatie("Ghica");
    }
}
