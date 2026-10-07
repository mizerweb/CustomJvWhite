package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import net.jpountz.lz4.LZ4Exception;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.BitrateAdjuster;
import org.webrtc.BitrateAdjusterFactory;
import org.webrtc.HardwareVideoEncoderExceptionHandler;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.VideoCodecMimeType;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.GetAnonymTokenByLinkRequest;
import ru.ok.android.externcalls.sdk.api.JoinByLinkResponse;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eu6 implements k74, mf7, hu8, kq4, p48, BitrateAdjusterFactory, HardwareVideoEncoderExceptionHandler, b48, bg7, gdd, qg4, rf7 {
    public final /* synthetic */ int a;

    public static /* synthetic */ void a(int i) {
        throw new LZ4Exception("Error decoding offset " + i + ((Object) " of input buffer"));
    }

    public static /* synthetic */ void d(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0((g85) h74Var);
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 7:
                sx8 sx8Var = (sx8) obj;
                return sx8Var.a + ": " + sx8Var.b;
            case 9:
                return (cyh) obj;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                fy7 fy7Var = (fy7) obj;
                fy7Var.f();
                return c98.n(j8f.f(new ahc(27), fy7Var.I.b));
            case 22:
                w58 w58Var = z58.F;
                return null;
            default:
                return obj.toString();
        }
    }

    @Override // defpackage.b48
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // org.webrtc.BitrateAdjusterFactory
    public BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
        return HardwareVideoEncoderFactory.lambda$static$0(videoCodecMimeType, str);
    }

    @Override // defpackage.kq4
    public Object h(Task task) throws IOException {
        Object obj;
        kam kamVar = (kam) task;
        synchronized (kamVar.a) {
            yab.u("Task is not yet complete", kamVar.c);
            if (kamVar.d) {
                throw new CancellationException("Task is already canceled.");
            }
            boolean zIsInstance = IOException.class.isInstance(kamVar.f);
            Exception exc = kamVar.f;
            if (zIsInstance) {
                throw ((Throwable) IOException.class.cast(exc));
            }
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            obj = kamVar.e;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            qr7.k("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            qr7.k("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            qr7.k(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        qr7.k("SERVICE_NOT_AVAILABLE");
        return null;
    }

    @Override // org.webrtc.HardwareVideoEncoderExceptionHandler
    public void handle(Throwable th) {
        HardwareVideoEncoderFactory.lambda$static$1(th);
    }

    @Override // defpackage.p48
    public void j(nof nofVar) {
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        String strF;
        switch (this.a) {
            case 13:
                return GetAnonymTokenByLinkRequest.lambda$static$0(vu8Var);
            case 14:
                vu8Var.p();
                while (vu8Var.hasNext()) {
                    if (cqk.d(vu8Var.name(), ApiProtocol.KEY_UPLOAD_URL)) {
                        strF = vu8Var.F();
                        vu8Var.t();
                        return new ll7(strF);
                    }
                }
                strF = null;
                vu8Var.t();
                return new ll7(strF);
            case 17:
                return HangupConversation.Response.PARSER$lambda$0(vu8Var);
            case 24:
                return JoinByLinkResponse.lambda$static$0(vu8Var);
            case 25:
                return JoinConversation.Response.PARSER$lambda$0(vu8Var);
            default:
                sg9 sg9Var = new sg9();
                vu8Var.p();
                while (vu8Var.hasNext()) {
                    String strName = vu8Var.name();
                    strName.getClass();
                    switch (strName) {
                        case "auth_token":
                            sg9Var.c = vu8Var.F();
                            break;
                        case "session_key":
                            sg9Var.b = vu8Var.F();
                            break;
                        case "uid":
                            sg9Var.a = vu8Var.F();
                            break;
                        case "auth_hash":
                            sg9Var.e = vu8Var.F();
                            break;
                        case "api_server":
                            sg9Var.d = vu8Var.F();
                            break;
                        default:
                            vu8Var.x();
                            break;
                    }
                }
                vu8Var.t();
                return sg9Var;
        }
    }

    public /* synthetic */ eu6(int i, Object obj) {
        this.a = i;
    }

    public /* synthetic */ eu6(int i) {
        this.a = i;
    }

    @Override // defpackage.gdd
    /* JADX INFO: renamed from: apply */
    public boolean mo28apply(Object obj) {
        CancellationException cancellationException = b78.l;
        return true;
    }
}
