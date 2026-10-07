package defpackage;

import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class wcc extends WebChromeClient {
    public final vtj a;
    public final juj b;
    public final boolean c;

    public wcc(vtj vtjVar, juj jujVar, boolean z) {
        this.a = vtjVar;
        this.b = jujVar;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String name;
        a4c a4cVar;
        Integer numB0;
        if ((consoleMessage != null ? consoleMessage.messageLevel() : null) == ConsoleMessage.MessageLevel.ERROR) {
            juj jujVar = this.b;
            String strMessage = consoleMessage.message();
            jujVar.getClass();
            je9 je9Var = je9.f;
            int iIntValue = 0;
            if (r5h.L0(strMessage, "Unexpected token", false)) {
                String str = (String) ww3.t1(r5h.m1((String) jujVar.b.getValue(), new String[]{"."}, 6));
                if (str != null && (numB0 = y5h.B0(str)) != null) {
                    iIntValue = numB0.intValue();
                }
                if (iIntValue < 70) {
                    qsj qsjVar = jujVar.a;
                    String str2 = qsjVar.g;
                    owh owhVar = str2 != null ? new owh(str2) : null;
                    String str3 = owhVar != null ? owhVar.a : null;
                    if (str3 == null || str3.length() == 0) {
                        String str4 = qsjVar.b;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str4, "Invoked 'failed_old_webview', but traceId is null or empty!", null);
                        }
                    } else {
                        qrc.o(qsjVar, psj.OLD_WEBVIEW_BLOCKED, str3, null, null, 28);
                    }
                    String name2 = juj.class.getName();
                    iuj iujVar = new iuj((String) jujVar.b.getValue(), strMessage);
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, name2, qv1.l("Couldn't execute JS code on old webview (", (String) jujVar.b.getValue(), "): ", strMessage), iujVar);
                    }
                } else {
                    name = juj.class.getName();
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, name, "Java script console error with message: ".concat(strMessage), null);
                    }
                }
            } else {
                name = juj.class.getName();
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Java script console error with message: ".concat(strMessage), null);
                }
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        boolean z3 = ycc.c;
        ycc yccVarC = lu8.c(webView.getContext(), this.c);
        yccVarC.setWebViewClient(new vcc(this, yccVarC));
        ((WebView.WebViewTransport) (message != null ? message.obj : null)).setWebView(yccVarC);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        ycc yccVar = webView instanceof ycc ? (ycc) webView : null;
        if (yccVar == null) {
            return false;
        }
        ValueCallback<Uri[]> filePathCallback = yccVar.getFilePathCallback();
        if (filePathCallback != null) {
            filePathCallback.onReceiveValue(null);
        }
        yccVar.setFilePathCallback(valueCallback);
        this.a.m(fileChooserParams);
        return true;
    }
}
