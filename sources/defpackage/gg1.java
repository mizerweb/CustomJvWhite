package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class gg1 implements t65, lj6 {
    public boolean a;
    public long b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public gg1(vp9 vp9Var) {
        wp9 wp9Var;
        up9 up9Var = vp9Var.b;
        this.b = vp9Var.d;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        vp9Var.A(this);
        s8 s8Var = new s8();
        while (true) {
            jj6 jj6Var = vp9Var.a;
            qa5 qa5Var = up9Var.c;
            if (qa5Var == null) {
                ore.p("Required value was null.");
                throw null;
            }
            int iL = jj6Var.l(qa5Var, s8Var);
            if (iL == 1) {
                long j = s8Var.a;
                Uri uri = up9Var.a.getUri();
                if (uri == null) {
                    ore.p("Required value was null.");
                    throw null;
                }
                up9Var.close();
                up9Var.f(new a35(uri, 0L, 1, null, Collections.EMPTY_MAP, j, -1L, null, 0, null));
            } else if (iL == -1 && this.a) {
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    ((wp9) it.next()).c.f();
                }
                return;
            } else {
                if (iL == -1) {
                    throw new ji1(zo5.l(vp9Var.c, "Invalid media specified="), 6);
                }
                if (this.a && ((xbf) this.f) != null && ((wp9Var = (wp9) ww3.t1((ArrayList) this.c)) == null || ((Float) wp9Var.c.c) != null)) {
                    return;
                }
            }
        }
    }

    public static y26 b(ArrayList arrayList, Rect rect, boolean z) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            jy8 jy8Var = (jy8) it.next();
            arrayList2.add(new jy8(i2, jy8Var.b, jy8Var.c, jy8Var.d, jy8Var.e));
            arrayList3.add(new cy3(i2));
            i = i2;
        }
        return new y26(arrayList2, arrayList3, new Rect(rect), z);
    }

    @Override // defpackage.lj6
    public void D() {
        this.a = true;
    }

    @Override // defpackage.lj6
    public kyh G(int i, int i2) {
        wp9 wp9Var = new wp9(i2);
        if (i2 == 1) {
            ((ArrayList) this.d).add(wp9Var);
            return wp9Var;
        }
        if (i2 != 2) {
            ((ArrayList) this.e).add(wp9Var);
            return wp9Var;
        }
        ((ArrayList) this.c).add(wp9Var);
        return wp9Var;
    }

    public void a() {
        if (this.a) {
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((d9j) it.next()).b();
            }
            this.a = false;
        }
    }

    public void c() {
        View view;
        if (this.a) {
            return;
        }
        for (d9j d9jVar : (ArrayList) this.c) {
            long j = this.b;
            if (j >= 0) {
                d9jVar.c(j);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) d9jVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((e9j) this.e) != null) {
                d9jVar.d((fvh) this.f);
            }
            View view2 = (View) d9jVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.a = true;
    }

    @Override // defpackage.lj6
    public void r(xbf xbfVar) {
        this.f = xbfVar;
    }

    @Override // defpackage.t65
    public Object t() {
        ou7 ou7Var = CallIncomingScreen.m;
        long j = this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        boolean z = this.a;
        ha9 ha9Var = (ha9) this.e;
        String string = this.f.toString();
        ou7Var.getClass();
        return new CallIncomingScreen(n1g.i(new ylc("call_incoming_avatar", str2), new ylc("call_incoming_name", str), new ylc("call_incoming_chat_id", Long.valueOf(j)), new ylc("call_incoming_video", Boolean.valueOf(z)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("call_incoming_session_id", string)));
    }

    public gg1() {
        this.b = -1L;
        this.f = new fvh(this);
        this.c = new ArrayList();
    }

    public gg1(long j, String str, String str2, boolean z, ha9 ha9Var, Object obj) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.a = z;
        this.e = ha9Var;
        this.f = obj;
    }
}
