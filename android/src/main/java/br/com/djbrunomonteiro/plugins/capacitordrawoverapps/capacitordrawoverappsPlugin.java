package br.com.djbrunomonteiro.plugins.capacitordrawoverapps;

import android.Manifest;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@NativePlugin(
        requestCodes={ContactsPlugin.SYSTEM_ALERT_WINDOW}
)
public class capacitordrawoverappsPlugin extends Plugin {

    private capacitordrawoverapps implementation = new capacitordrawoverapps();

    @PluginMethod

    public void show(PluginCall call){
        
    }


    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
}
