package defpackage;

import com.vk.push.common.Logger;
import java.security.cert.X509Certificate;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class yki implements luj, zjk, ptb, cub, ttb, ntb {
    public final Object a;

    public yki(int i) {
        switch (i) {
            case 7:
                this.a = new CountDownLatch(1);
                break;
            default:
                this.a = new lge(c0a.o("[?&]", Pattern.quote(ConversationWebRTCStat.KEY_TRANSPORT), "=([^&]+)"));
                break;
        }
    }

    @Override // defpackage.cub
    public void a(Object obj) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.luj
    public WebViewProviderBoundaryInterface b(q6f q6fVar) {
        return (WebViewProviderBoundaryInterface) l21.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.a).createWebView(q6fVar));
    }

    @Override // defpackage.ntb
    public void c() {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.luj
    public String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.a).getSupportedFeatures();
    }

    @Override // defpackage.luj
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) l21.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.a).getStatics());
    }

    @Override // defpackage.ptb
    public void onComplete(Throwable th) {
        if (th instanceof TaskCancellationException) {
            cqk.g((gu4) this.a);
        }
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.zjk
    public boolean verify(String str, X509Certificate x509Certificate) {
        return ((x5k) this.a).verify(str, x509Certificate);
    }

    public /* synthetic */ yki(Object obj) {
        this.a = obj;
    }

    public yki(Logger logger) {
        this.a = logger.createLogger("ClientIdDataSource");
    }
}
