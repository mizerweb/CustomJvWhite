package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.Logger;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.ExtensionsKt;
import com.vk.push.core.network.utils.ResponseErrorKt;
import java.util.concurrent.CancellationException;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;

/* JADX INFO: loaded from: classes3.dex */
public final class fij extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fij(fjh fjhVar, lq4 lq4Var, u9k u9kVar) {
        super(2, lq4Var);
        this.e = 6;
        this.f = fjhVar;
        this.g = u9kVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                fij fijVar = new fij((gij) obj2, lq4Var, 0);
                fijVar.f = obj;
                return fijVar;
            case 1:
                fij fijVar2 = new fij((skj) obj2, lq4Var, 1);
                fijVar2.f = obj;
                return fijVar2;
            case 2:
                return new fij((q6f) this.f, (String) obj2, lq4Var, 2);
            case 3:
                return new fij((WebAppRootScreen) this.f, (String) obj2, lq4Var, 3);
            case 4:
                fij fijVar3 = new fij((osj) obj2, lq4Var, 4);
                fijVar3.f = obj;
                return fijVar3;
            case 5:
                return new fij((String) this.f, (x9k) obj2, lq4Var, 5);
            case 6:
                return new fij((fjh) this.f, lq4Var, (u9k) obj2);
            case 7:
                fij fijVar4 = new fij((xo9) obj2, lq4Var, 7);
                fijVar4.f = obj;
                return fijVar4;
            default:
                return new fij((String) this.f, (r6a) obj2, lq4Var, 8);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        Object obj3 = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((fij) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((fij) create((vgb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((fij) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((fij) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((fij) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                return new fij((String) this.f, (x9k) obj3, (lq4) obj2, 5).invokeSuspend(sbiVar);
            case 6:
                new fij((fjh) this.f, (lq4) obj2, (u9k) obj3).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                fij fijVar = new fij((xo9) obj3, (lq4) obj2, 7);
                fijVar.f = (gu4) obj;
                return fijVar.invokeSuspend(sbiVar);
            default:
                return new fij((String) this.f, (r6a) obj3, (lq4) obj2, 8).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object poeVar;
        Object poeVar2;
        poe poeVar3;
        int i = this.e;
        Object poeVar4 = sbi.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                Throwable th = (Throwable) this.f;
                ch3.d0(obj);
                gm0.V(gij.class.getName(), "failed on get launch context", th);
                return poeVar4;
            case 1:
                vgb vgbVar = (vgb) this.f;
                ch3.d0(obj);
                int iOrdinal = vgbVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    skj skjVar = (skj) obj2;
                    skjVar.g.B(skjVar, skj.h[0], yab.i0(skjVar.b, null, 2, new hpf(skjVar, null, 27), 1));
                }
                return poeVar4;
            case 2:
                ch3.d0(obj);
                ((q6f) this.f).evaluateJavascript((String) obj2, new zcc(1));
                return poeVar4;
            case 3:
                ch3.d0(obj);
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.f;
                xde xdeVar = new xde(webAppRootScreen.getContext());
                ((Intent) xdeVar.c).setType(HTTP.PLAIN_TEXT_TYPE);
                xdeVar.Q((String) obj2);
                xdeVar.R();
                rpj rpjVar = webAppRootScreen.J1().L1;
                if (rpjVar != null) {
                    rpjVar.a(poeVar4);
                }
                return poeVar4;
            case 4:
                Throwable th2 = (Throwable) this.f;
                ch3.d0(obj);
                gm0.V(osj.class.getName(), "failed on get view port size", th2);
                return poeVar4;
            case 5:
                ch3.d0(obj);
                String str = (String) this.f;
                return new ylc(str, Boolean.valueOf(((x9k) obj2).b.checkAppInstalled(str)));
            case 6:
                fjh fjhVar = (fjh) this.f;
                ch3.d0(obj);
                u9k u9kVar = (u9k) obj2;
                boolean zInvoke = u9kVar.b.invoke();
                Logger logger = u9kVar.c;
                if (zInvoke) {
                    Logger.DefaultImpls.info$default(logger, "Push is available", null, 2, null);
                    poeVar = poeVar4;
                } else {
                    Logger.DefaultImpls.info$default(logger, "Push is unavailable", null, 2, null);
                    poeVar = new poe(new RuStorePushClientException.HostAppNotInstalledException("Push is unavailable, need to install host app"));
                }
                if (!(poeVar instanceof poe)) {
                    fjhVar.b(poeVar);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    fjhVar.a(thA);
                }
                return poeVar4;
            case 7:
                ch3.d0(obj);
                xo9 xo9Var = (xo9) obj2;
                try {
                    rjk rjkVarB = xo9.k(xo9Var).b();
                    poeVar2 = new hkk(rjkVarB.e, rjkVarB.f, rjkVarB.g, rjkVarB.h);
                    break;
                } catch (Throwable th3) {
                    poeVar2 = new poe(th3);
                }
                Throwable thA2 = roe.a(poeVar2);
                if (thA2 == null) {
                    return poeVar2;
                }
                if (thA2 instanceof CancellationException) {
                    throw thA2;
                }
                s2f.b(xo9Var.e, thA2, null, new bdk(1), 2);
                ifh ifhVar = sjk.a;
                long elapsedCpuTime = Process.getElapsedCpuTime();
                if (elapsedCpuTime < 0) {
                    elapsedCpuTime = 0;
                }
                long jLongValue = ((Number) sjk.a.getValue()).longValue();
                if (jLongValue < 1) {
                    jLongValue = 1;
                }
                return new hkk((jLongValue * elapsedCpuTime) / 1000, 0L, 0L, 0L);
            default:
                ch3.d0(obj);
                r6a r6aVar = (r6a) obj2;
                Object objM26executeRequestIoAF18A = ((HttpClient) r6aVar.a).m26executeRequestIoAF18A(new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), (HostInfoProvider) r6aVar.c).encodedPath("v1/projects/" + ((String) r6aVar.b) + "/token:invalidate").build().toString(), new JSONObject().put(ApiProtocol.KEY_TOKEN, (String) this.f).toString()));
                try {
                    ch3.d0(objM26executeRequestIoAF18A);
                    HttpResponse httpResponse = (HttpResponse) objM26executeRequestIoAF18A;
                    if (!ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                        if (httpResponse.isSuccessful()) {
                            httpResponse.getBody();
                        } else {
                            String message = httpResponse.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            poeVar3 = new poe(new VkpnsRequestException(message, httpResponse.getCode()));
                        }
                        return new roe(poeVar4);
                    }
                    ResponseError errorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                    poeVar3 = new poe(new VkpnsRequestWithErrorBodyException(errorResponse.toString(), errorResponse.getCode()));
                    poeVar4 = poeVar3;
                } catch (Exception e) {
                    poeVar4 = new poe(e);
                }
                return new roe(poeVar4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fij(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fij(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
