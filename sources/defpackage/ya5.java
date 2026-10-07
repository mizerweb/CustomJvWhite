package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ya5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ za5 b;

    public /* synthetic */ ya5(za5 za5Var, int i) {
        this.a = i;
        this.b = za5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.a) {
            case 0:
                za5 za5Var = this.b;
                synchronized (za5Var) {
                    ((uik) za5Var.a.get()).A(System.currentTimeMillis(), ((xe5) za5Var.c.get()).a());
                    break;
                }
                return null;
            default:
                za5 za5Var2 = this.b;
                synchronized (za5Var2) {
                    try {
                        uik uikVar = (uik) za5Var2.a.get();
                        ArrayList arrayListR = uikVar.r();
                        uikVar.i();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListR.size(); i++) {
                            ph0 ph0Var = (ph0) arrayListR.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", ph0Var.a);
                            jSONObject.put("dates", new JSONArray((Collection) ph0Var.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
        }
    }
}
