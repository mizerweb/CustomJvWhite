package defpackage;

import android.graphics.SurfaceTexture;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.Surface;
import com.vk.push.core.filedatastore.FileDataStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class vog implements zs3, q5j, o4g, rg4 {
    public Object a;

    public /* synthetic */ vog(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    public Object a(nq4 nq4Var) {
        cgk cgkVar;
        int i;
        if (nq4Var instanceof cgk) {
            cgkVar = (cgk) nq4Var;
            int i2 = cgkVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cgkVar.h = i2 - Integer.MIN_VALUE;
            } else {
                cgkVar = new cgk(this, nq4Var);
            }
        } else {
            cgkVar = new cgk(this, nq4Var);
        }
        Object obj = cgkVar.f;
        int i3 = cgkVar.h;
        boolean z = false;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(obj);
            FileDataStore fileDataStore = (FileDataStore) this.a;
            cgkVar.d = this;
            cgkVar.h = 1;
            obj = fileDataStore.read(cgkVar);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i3 == 1) {
            this = cgkVar.d;
            ch3.d0(obj);
        } else {
            if (i3 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = cgkVar.e;
            ch3.d0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (i != 0 && zBooleanValue) {
            z = true;
        }
        return Boolean.valueOf(z);
        agk agkVar = (agk) obj;
        ?? r9 = agkVar != null ? agkVar.a : 0;
        FileDataStore fileDataStore2 = (FileDataStore) this.a;
        agk agkVar2 = new agk(false);
        cgkVar.d = null;
        cgkVar.e = r9;
        cgkVar.h = 2;
        Object objWrite = fileDataStore2.write(agkVar2, cgkVar);
        if (objWrite != hu4Var) {
            ?? r7 = r9;
            obj = objWrite;
            i = r7 == true ? 1 : 0;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            if (i != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return hu4Var;
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        du1 du1Var;
        yt1 yt1Var;
        mkc mkcVar = (mkc) this.a;
        if (mkcVar.a) {
            ((CidLogger) mkcVar.b).log("OwnTalkingReporter", "on voice stop detected and reported");
            h91 h91Var = (h91) mkcVar.f;
            if (h91Var != null) {
                ru1 ru1Var = h91Var.a;
                du1 du1Var2 = ru1Var.a;
                boolean zE = du1Var2.e();
                du1Var2.o = false;
                if (zE != du1Var2.e() && (yt1Var = (du1Var = ru1Var.a).a) != null) {
                    ru1Var.f(ru1Var.c(yt1Var), Collections.singletonList(du1Var));
                }
            }
            mkcVar.a = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public ArrayList b() {
        ?? SingletonList;
        rui ruiVar = (rui) this.a;
        if (ruiVar.b() && (ruiVar instanceof v84)) {
            List list = ((v84) ruiVar).a;
            SingletonList = new ArrayList(yw3.W0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SingletonList.add(new z15(((u84) it.next()).e, 2));
            }
        } else if (ruiVar.b() && (ruiVar instanceof c5i)) {
            c5i c5iVar = (c5i) ruiVar;
            SingletonList = Collections.singletonList(new ot3(new z15(c5iVar.h, 2), vqi.X(c5iVar.b), vqi.X(c5iVar.c), true));
        } else if (ruiVar.b()) {
            SingletonList = Collections.singletonList(new z15(ruiVar.d(), 2));
        } else if (cqk.d(ruiVar.getContentType(), "application/dash+xml")) {
            SingletonList = Collections.singletonList(ruiVar.h() ? new j15(ruiVar.d()) : new z15(ruiVar.d(), 0));
        } else if (cqk.d(ruiVar.getContentType(), "video/hls")) {
            SingletonList = Collections.singletonList(ruiVar.h() ? new hx7(ruiVar.d()) : new z15(ruiVar.d(), 1));
        } else {
            SingletonList = cqk.d(ruiVar.getContentType(), "video/mp4") ? Collections.singletonList(new z15(ruiVar.d(), 3)) : 0;
        }
        if (SingletonList == 0) {
            return null;
        }
        Iterable<m4j> iterable = (Iterable) SingletonList;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        for (m4j ym5Var : iterable) {
            if (cqk.d(ruiVar.getContentType(), "application/dash+xml") || cqk.d(ruiVar.getContentType(), "video/hls")) {
                ym5Var = new ym5(String.valueOf(ruiVar.k()), ym5Var);
            }
            arrayList.add(ym5Var);
        }
        return arrayList;
    }

    public void c(long j, long j2) {
        g2i g2iVar = (g2i) this.a;
        wv5 wv5Var = g2iVar.q;
        wv5Var.getClass();
        boolean z = true;
        lvb.R(j >= 0 || j == -9223372036854775807L);
        wv5Var.a = j;
        if (j2 <= 0 && j2 != -1) {
            z = false;
        }
        lvb.N(j2, "Invalid file size = %s", z);
        wv5Var.b = j2;
        k2i k2iVar = g2iVar.s;
        k2iVar.getClass();
        k2iVar.e();
        k2iVar.j.d(null, 4, 0, 0).b();
    }

    @Override // defpackage.q5j
    public boolean isDebugEnabled() {
        UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.a;
        return ((xb9) ((et3) userStoriesScreen.g.getValue())).g0() && ((Boolean) ((e5d) userStoriesScreen.h.getValue()).x().i()).booleanValue();
    }

    @Override // defpackage.q5j
    public int k() {
        rui ruiVar = ((UserStoriesScreen) this.a).Z;
        if (ruiVar != null) {
            return ruiVar.getHeight();
        }
        return 0;
    }

    @Override // defpackage.q5j
    public int n() {
        rui ruiVar = ((UserStoriesScreen) this.a).Z;
        if (ruiVar != null) {
            return ruiVar.getWidth();
        }
        return 0;
    }

    @Override // defpackage.q5j
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((UserStoriesScreen) this.a).a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "UserStoriesScreen. Video viewer, surface destroyed " + surfaceTexture, null);
        }
    }

    @Override // defpackage.zs3
    public boolean u(ClickableSpan clickableSpan, int i, int i2, String str, t59 t59Var, MotionEvent motionEvent) {
        zs3 onLinkLongClickListener = ((gnh) this.a).getOnLinkLongClickListener();
        return onLinkLongClickListener != null && onLinkLongClickListener.u(clickableSpan, i, i2, str, t59Var, motionEvent);
    }

    @Override // defpackage.q5j
    public int v() {
        return 2;
    }

    @Override // defpackage.q5j
    public void x(Surface surface, uvi uviVar) {
        String str = ((UserStoriesScreen) this.a).a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "UserStoriesScreen. Video viewer, set surface " + surface, null);
            }
        }
        e3j e3jVar = (e3j) ((UserStoriesScreen) this.a).r.getValue();
        e3jVar.H(surface);
        e3jVar.C(uviVar);
    }
}
