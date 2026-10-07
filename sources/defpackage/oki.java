package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class oki implements q5j, wtj, pg5, ptb, rg4, cub {
    public Object a;

    public /* synthetic */ oki(Object obj) {
        this.a = obj;
    }

    public static void c(HashSet hashSet, String str) {
        if (ch3.r(str)) {
            return;
        }
        hashSet.add(new File(str));
    }

    @Override // defpackage.cub
    public void a(Object obj) {
        ((qjh) ((fpi) this.a).b).a.p();
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        ((ykc) this.a).f.invoke("error occurred: " + th);
    }

    @Override // defpackage.wtj
    public void b(int i, int i2, CharSequence charSequence) {
        i6j i6jVar = (i6j) this.a;
        String name = i6j.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            i6jVar.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, c0a.n(i6jVar.n.a.getValue(), "videoWebView: onPageLoadingError: "), null);
            }
        }
        mjg mjgVar = i6jVar.m;
        llc llcVar = llc.a;
        mjgVar.getClass();
        mjgVar.j(null, llcVar);
    }

    @Override // defpackage.wtj
    public void d() {
        Object value;
        i6j i6jVar = (i6j) this.a;
        String name = i6j.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            i6jVar.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, c0a.n(i6jVar.n.a.getValue(), "videoWebView: onPageFinishLoading: "), null);
            }
        }
        mjg mjgVar = i6jVar.m;
        do {
            value = mjgVar.getValue();
            plc plcVar = (plc) value;
            if (!(plcVar instanceof nlc) && !(plcVar instanceof mlc) && plcVar != null) {
                return;
            }
        } while (!mjgVar.h(value, new nlc()));
    }

    @Override // defpackage.wtj
    public void e(String str) {
        ((i6j) this.a).D(str, false);
    }

    @Override // defpackage.wtj
    public boolean f() {
        return ((xb9) ((et3) ((i6j) this.a).j.getValue())).e0();
    }

    public boolean g() {
        return ((o91) this.a).q0 != null;
    }

    @Override // defpackage.pg5
    public Map getRemoteVideoRenderers(yt1 yt1Var) {
        pg5 pg5Var = ((o91) this.a).q0;
        return pg5Var != null ? pg5Var.getRemoteVideoRenderers(yt1Var) : Collections.EMPTY_MAP;
    }

    @Override // defpackage.wtj
    public boolean h(Uri uri) {
        return false;
    }

    @Override // defpackage.q5j
    public boolean isDebugEnabled() {
        VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.a;
        return ((xb9) ((et3) videoMessageWidget.e.getValue())).g0() && ((Boolean) ((e5d) videoMessageWidget.d.getValue()).x().i()).booleanValue();
    }

    @Override // defpackage.q5j
    public int k() {
        rui ruiVar = ((VideoMessageWidget) this.a).q;
        return ruiVar != null ? ruiVar.getHeight() : gm0.K(352.0f * yl5.d().getDisplayMetrics().density);
    }

    @Override // defpackage.q5j
    public int n() {
        rui ruiVar = ((VideoMessageWidget) this.a).q;
        return ruiVar != null ? ruiVar.getWidth() : gm0.K(352.0f * yl5.d().getDisplayMetrics().density);
    }

    @Override // defpackage.ptb
    public void onComplete(Throwable th) {
        if (th instanceof TaskCancellationException) {
            cqk.g((gu4) this.a);
        }
    }

    @Override // defpackage.q5j
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((VideoMessageWidget) this.a).h;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "Video Message screen, surface destroyed " + surfaceTexture, null);
        }
    }

    @Override // defpackage.q5j
    public int v() {
        return 2;
    }

    @Override // defpackage.q5j
    public void x(Surface surface, uvi uviVar) {
        String str = ((VideoMessageWidget) this.a).h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Video Message screen, set surface " + surface, null);
            }
        }
        ((VideoMessageWidget) this.a).x1().H(surface);
        ((VideoMessageWidget) this.a).x1().C(uviVar);
    }
}
