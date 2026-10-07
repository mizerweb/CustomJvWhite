package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class re4 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final int a;
    public final int b;
    public final e38 c;
    public final PendingIntent d;
    public final fmf e;
    public final h3d f;
    public final h3d g;
    public final Bundle h;
    public final Bundle i;
    public final c4d j;
    public final c98 k;
    public final c98 l;
    public final MediaSession.Token m;
    public final c98 n;

    static {
        String str = vqi.a;
        o = Integer.toString(0, 36);
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = Integer.toString(9, 36);
        s = Integer.toString(14, 36);
        t = Integer.toString(13, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(11, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(12, 36);
    }

    public re4(int i, int i2, e38 e38Var, PendingIntent pendingIntent, c98 c98Var, c98 c98Var2, c98 c98Var3, fmf fmfVar, h3d h3dVar, h3d h3dVar2, Bundle bundle, Bundle bundle2, c4d c4dVar, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = e38Var;
        this.d = pendingIntent;
        this.k = c98Var;
        this.l = c98Var2;
        this.n = c98Var3;
        this.e = fmfVar;
        this.f = h3dVar;
        this.g = h3dVar2;
        this.h = bundle;
        this.i = bundle2;
        this.j = c4dVar;
        this.m = token;
    }

    public static re4 a(Bundle bundle) {
        ghe gheVarA;
        ghe gheVarA2;
        ghe gheVarA3;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof qe4) {
            return ((qe4) binder).c;
        }
        int i = 0;
        int i2 = bundle.getInt(o, 0);
        int i3 = bundle.getInt(A, 0);
        IBinder iBinderA = vfl.a(bundle, p);
        iBinderA.getClass();
        IBinder iBinder = iBinderA;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(r);
        if (parcelableArrayList != null) {
            gheVarA = l51.a(new pe4(i3, i), parcelableArrayList);
        } else {
            a98 a98Var = c98.b;
            gheVarA = ghe.e;
        }
        ghe gheVar = gheVarA;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(s);
        if (parcelableArrayList2 != null) {
            gheVarA2 = l51.a(new pe4(i3, 1), parcelableArrayList2);
        } else {
            a98 a98Var2 = c98.b;
            gheVarA2 = ghe.e;
        }
        ghe gheVar2 = gheVarA2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(t);
        if (parcelableArrayList3 != null) {
            gheVarA3 = l51.a(new pe4(i3, 2), parcelableArrayList3);
        } else {
            a98 a98Var3 = c98.b;
            gheVarA3 = ghe.e;
        }
        ghe gheVar3 = gheVarA3;
        Bundle bundle2 = bundle.getBundle(u);
        fmf fmfVarA = bundle2 == null ? fmf.b : fmf.a(bundle2);
        Bundle bundle3 = bundle.getBundle(w);
        h3d h3dVarB = bundle3 == null ? h3d.b : h3d.b(bundle3);
        Bundle bundle4 = bundle.getBundle(v);
        h3d h3dVarB2 = bundle4 == null ? h3d.b : h3d.b(bundle4);
        Bundle bundleN = vqi.n(bundle.getBundle(x));
        Bundle bundleN2 = vqi.n(bundle.getBundle(y));
        Bundle bundle5 = bundle.getBundle(z);
        c4d c4dVarP = bundle5 == null ? c4d.H : c4d.p(i3, bundle5);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle6 = bundleN2;
        int i4 = t4a.i;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        e38 c38Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e38)) ? new c38(iBinder) : (e38) iInterfaceQueryLocalInterface;
        if (bundleN == null) {
            bundleN = Bundle.EMPTY;
        }
        Bundle bundle7 = bundleN;
        if (bundle6 == null) {
            bundle6 = Bundle.EMPTY;
        }
        return new re4(i2, i3, c38Var, pendingIntent, gheVar, gheVar2, gheVar3, fmfVarA, h3dVarB2, h3dVarB, bundle7, bundle6, c4dVarP, token);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(o, this.a);
        vfl.d(bundle, p, this.c.asBinder());
        bundle.putParcelable(q, this.d);
        c98 c98Var = this.k;
        boolean zIsEmpty = c98Var.isEmpty();
        int i2 = 28;
        String str = r;
        if (!zIsEmpty) {
            bundle.putParcelableArrayList(str, l51.e(c98Var, new p51(i2)));
        }
        c98 c98Var2 = this.l;
        if (!c98Var2.isEmpty()) {
            if (i >= 7) {
                bundle.putParcelableArrayList(s, l51.e(c98Var2, new p51(i2)));
            } else {
                bundle.putParcelableArrayList(str, l51.e(by3.j(c98Var2, true, true), new p51(i2)));
            }
        }
        c98 c98Var3 = this.n;
        if (!c98Var3.isEmpty()) {
            bundle.putParcelableArrayList(t, l51.e(c98Var3, new p51(i2)));
        }
        fmf fmfVar = this.e;
        fmfVar.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        pci it = fmfVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((emf) it.next()).b());
        }
        bundle2.putParcelableArrayList(fmf.c, arrayList);
        bundle.putBundle(u, bundle2);
        String str2 = v;
        h3d h3dVar = this.f;
        bundle.putBundle(str2, h3dVar.c());
        String str3 = w;
        h3d h3dVar2 = this.g;
        bundle.putBundle(str3, h3dVar2.c());
        bundle.putBundle(x, this.h);
        bundle.putBundle(y, this.i);
        bundle.putBundle(z, this.j.o(gm0.B(h3dVar, h3dVar2), false, false).r(i));
        bundle.putInt(A, this.b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}
