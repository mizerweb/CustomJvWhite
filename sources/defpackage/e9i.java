package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class e9i {
    public static final c5b a = new c5b("UNDEFINED", 1);
    public static final c5b b = new c5b("REUSABLE_CLAIMED", 1);
    public static final long[] c = {-9187201950435737345L, -1};
    public static final long[] d = new long[0];
    public static final Object[] e = new Object[0];
    public static final c5b f = new c5b("NO_VALUE", 1);

    public static final j3 A(xx6 xx6Var, xx6 xx6Var2, xx6 xx6Var3, xx6 xx6Var4, xx6 xx6Var5, xf7 xf7Var) {
        return new j3(new xx6[]{xx6Var, xx6Var2, xx6Var3, xx6Var4, xx6Var5}, 19, xf7Var);
    }

    public static final boolean A0(xt4 xt4Var, vt4 vt4Var) throws DispatchException {
        try {
            return xt4Var.P0(vt4Var);
        } catch (Throwable th) {
            throw new DispatchException(th, xt4Var, vt4Var);
        }
    }

    public static final j3 B(xx6 xx6Var, xx6 xx6Var2, xx6 xx6Var3, xx6 xx6Var4, wf7 wf7Var) {
        return new j3(new xx6[]{xx6Var, xx6Var2, xx6Var3, xx6Var4}, 18, wf7Var);
    }

    public static final void B0(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        try {
            extras.size();
        } catch (BadParcelableException e2) {
            gm0.V(intent.getClass().getName(), "Got error during unparcel extras!", e2);
            intent.replaceExtras(Bundle.EMPTY);
        } catch (RuntimeException e3) {
            gm0.V(intent.getClass().getName(), "Got error during unparcel extras!", e3);
            intent.replaceExtras(Bundle.EMPTY);
        }
    }

    public static final j3 C(xx6 xx6Var, xx6 xx6Var2, xx6 xx6Var3, vf7 vf7Var) {
        return new j3(new xx6[]{xx6Var, xx6Var2, xx6Var3}, 17, vf7Var);
    }

    public static final void C0(sr3 sr3Var, xgh xghVar, String str, Integer num) {
        try {
            Field declaredField = sr3Var.d().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(xghVar, num);
        } catch (Throwable unused) {
        }
    }

    public static int D(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void D0(Object obj, String str, Drawable drawable) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, drawable);
        } catch (Exception unused) {
        }
    }

    public static final ir2 E(p41 p41Var) {
        return new ir2(p41Var, true);
    }

    public static final q8e E0(xx6 xx6Var, gu4 gu4Var, k0g k0gVar, int i) {
        i0g i0gVarJ = gm0.j(xx6Var, i);
        pzf pzfVarA = a(i, i0gVarJ.a, i0gVarJ.b);
        yab.h0(gu4Var, (vt4) i0gVarJ.d, k0gVar.equals(j0g.a) ? 1 : 4, new l83(6, null, k0gVar, (xx6) i0gVarJ.c, pzfVarA, f));
        return new q8e(pzfVarA);
    }

    public static final xx6 F(xx6 xx6Var, long j) {
        if (j >= 0) {
            return j == 0 ? xx6Var : new tz(5, new xy6(new uy6(j, 0), xx6Var, null));
        }
        ore.p("Debounce timeout should not be negative");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object F0(xx6 xx6Var, nq4 nq4Var) {
        h07 h07Var;
        wfe wfeVar;
        c5b c5bVar = vd7.e;
        if (nq4Var instanceof h07) {
            h07Var = (h07) nq4Var;
            int i = h07Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h07Var.f = i - Integer.MIN_VALUE;
            } else {
                h07Var = new h07(nq4Var);
            }
        } else {
            h07Var = new h07(nq4Var);
        }
        Object obj = h07Var.e;
        int i2 = h07Var.f;
        if (i2 == 0) {
            wfe wfeVarP = nbh.p(obj);
            wfeVarP.a = c5bVar;
            yx6 d90Var = new d90(9, wfeVarP);
            h07Var.d = wfeVarP;
            h07Var.f = 1;
            Object objCollect = xx6Var.collect(d90Var, h07Var);
            Object obj2 = hu4.a;
            if (objCollect == obj2) {
                return obj2;
            }
            wfeVar = wfeVarP;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wfeVar = h07Var.d;
            ch3.d0(obj);
        }
        Object obj3 = wfeVar.a;
        if (obj3 != c5bVar) {
            return obj3;
        }
        ore.f("Flow is empty");
        return null;
    }

    public static final xx6 G(xx6 xx6Var, long j) {
        return F(xx6Var, rx8.e0(j));
    }

    public static final r8e G0(xx6 xx6Var, gu4 gu4Var, k0g k0gVar, Object obj) {
        i0g i0gVarJ = gm0.j(xx6Var, 1);
        mjg mjgVarA = p90.a(obj);
        yab.h0(gu4Var, (vt4) i0gVarJ.d, k0gVar.equals(j0g.a) ? 1 : 4, new l83(6, null, k0gVar, (xx6) i0gVarJ.c, mjgVarA, obj));
        return new r8e(mjgVarA);
    }

    public static final to5 H(xx6 xx6Var, qf7 qf7Var) {
        nre nreVar = sb8.b;
        l(2, qf7Var);
        return sb8.p(xx6Var, nreVar, qf7Var);
    }

    public static v0g H0(Context context, kbc kbcVar) {
        v0g v0gVar = new v0g(context);
        v0gVar.setId(R.id.oneme_toolbar_subtitle);
        v0gVar.setEllipsize(TextUtils.TruncateAt.END);
        v0gVar.setTextColor(kbcVar.getText().b);
        v0gVar.setSingleLine();
        ex8 ex8Var = new ex8(28);
        ex8Var.K();
        ex8Var.P(kbcVar.getText().g);
        ex8Var.M(kbcVar.getText().c);
        ex8Var.S();
        ex8Var.N(900L);
        ex8Var.L(1.0f);
        ex8Var.O(gm0.K(360.0f * yl5.d().getDisplayMetrics().density));
        ex8Var.Q(new LinearInterpolator());
        v0gVar.b(ex8Var.s());
        l8j.a(v0gVar);
        q9i.a(q9i.i, v0gVar);
        return v0gVar;
    }

    public static final xx6 I(xx6 xx6Var) {
        return xx6Var instanceof gjg ? xx6Var : sb8.p(xx6Var, sb8.b, sb8.c);
    }

    public static void I0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(zo5.p(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        cqk.J(classCastException, e9i.class.getName());
        throw classCastException;
    }

    public static float J(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final tz J0(xx6 xx6Var, long j) {
        return new tz(5, new az6(j, null, xx6Var));
    }

    public static final lz6 K(xx6 xx6Var, int i) {
        if (i >= 0) {
            return new lz6(xx6Var, i);
        }
        c.o(zo5.h(i, "Drop count should be non-negative, but had "));
        return null;
    }

    public static final EnumSet K0(String str) {
        Object poeVar;
        JSONArray jSONArray = new JSONArray(str);
        EnumSet enumSetNoneOf = EnumSet.noneOf(i37.class);
        Iterator it = oc9.f0(0, jSONArray.length()).iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                return enumSetNoneOf;
            }
            try {
                poeVar = i37.valueOf(jSONArray.getString(gj8Var.nextInt()));
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            if (poeVar instanceof poe) {
                poeVar = null;
            }
            i37 i37Var = (i37) poeVar;
            if (i37Var != null) {
                enumSetNoneOf.add(i37Var);
            }
        }
    }

    public static final Object L(yx6 yx6Var, xx6 xx6Var, lq4 lq4Var) {
        M(yx6Var);
        Object objCollect = xx6Var.collect(yx6Var, lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }

    public static ArrayList L0(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(jSONArray.getLong(i)));
            }
            return arrayList;
        } catch (JSONException e2) {
            qr7.o(e2);
            return null;
        }
    }

    public static final void M(yx6 yx6Var) {
        if (yx6Var instanceof jrh) {
            throw ((jrh) yx6Var).a;
        }
    }

    public static final ur2 M0(xx6 xx6Var, tf7 tf7Var) {
        int i = zz6.a;
        return new ur2(tf7Var, xx6Var, k66.a, -2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object N(xx6 xx6Var, lq4 lq4Var) {
        c07 c07Var;
        wfe wfeVarP;
        AbortFlowException e2;
        a07 a07Var;
        c5b c5bVar = vd7.e;
        if (lq4Var instanceof c07) {
            c07Var = (c07) lq4Var;
            int i = c07Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c07Var.g = i - Integer.MIN_VALUE;
            } else {
                c07Var = new c07(lq4Var);
            }
        } else {
            c07Var = new c07(lq4Var);
        }
        Object obj = c07Var.f;
        int i2 = c07Var.g;
        if (i2 == 0) {
            wfeVarP = nbh.p(obj);
            wfeVarP.a = c5bVar;
            a07 a07Var2 = new a07(0, wfeVarP);
            try {
                c07Var.d = wfeVarP;
                c07Var.e = a07Var2;
                c07Var.g = 1;
                Object objCollect = xx6Var.collect(a07Var2, c07Var);
                Object obj2 = hu4.a;
                if (objCollect == obj2) {
                    return obj2;
                }
            } catch (AbortFlowException e3) {
                e2 = e3;
                a07Var = a07Var2;
                if (e2.a == a07Var) {
                    throw e2;
                }
                vd7.q(c07Var.getContext());
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a07Var = c07Var.e;
            wfeVarP = c07Var.d;
            try {
                ch3.d0(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.a == a07Var) {
                    throw e2;
                }
                vd7.q(c07Var.getContext());
            }
        }
        Object obj3 = wfeVarP.a;
        if (obj3 != c5bVar) {
            return obj3;
        }
        ore.f("Expected at least one element");
        return null;
    }

    public static final mzj N0(mzj mzjVar) {
        boolean zF = mzjVar.e.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zF2 = mzjVar.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zF3 = mzjVar.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (zF || !zF2 || !zF3) {
            return mzjVar;
        }
        String str = mzjVar.c;
        w4 w4Var = new w4(6, false);
        w4Var.p(mzjVar.e.a);
        ((LinkedHashMap) w4Var.a).put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return mzj.b(mzjVar, null, null, w4Var.e(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object O(xx6 xx6Var, qf7 qf7Var, lq4 lq4Var) {
        d07 d07Var;
        wfe wfeVar;
        AbortFlowException e2;
        vmb vmbVar;
        c5b c5bVar = vd7.e;
        if (lq4Var instanceof d07) {
            d07Var = (d07) lq4Var;
            int i = d07Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                d07Var.g = i - Integer.MIN_VALUE;
            } else {
                d07Var = new d07(lq4Var);
            }
        } else {
            d07Var = new d07(lq4Var);
        }
        Object obj = d07Var.f;
        int i2 = d07Var.g;
        if (i2 == 0) {
            wfe wfeVarP = nbh.p(obj);
            wfeVarP.a = c5bVar;
            vmb vmbVar2 = new vmb(qf7Var, 8, wfeVarP);
            try {
                d07Var.d = wfeVarP;
                d07Var.e = vmbVar2;
                d07Var.g = 1;
                Object objCollect = xx6Var.collect(vmbVar2, d07Var);
                Object obj2 = hu4.a;
                if (objCollect == obj2) {
                    return obj2;
                }
                wfeVar = wfeVarP;
            } catch (AbortFlowException e3) {
                wfeVar = wfeVarP;
                e2 = e3;
                vmbVar = vmbVar2;
                if (e2.a == vmbVar) {
                    throw e2;
                }
                vd7.q(d07Var.getContext());
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vmbVar = d07Var.e;
            wfeVar = d07Var.d;
            try {
                ch3.d0(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.a == vmbVar) {
                    throw e2;
                }
                vd7.q(d07Var.getContext());
            }
        }
        Object obj3 = wfeVar.a;
        if (obj3 != c5bVar) {
            return obj3;
        }
        ore.f("Expected at least one element matching the predicate");
        return null;
    }

    public static void O0(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = hvi.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ore.p(zo5.h(i2, "negative size: "));
                    return;
                }
                strB = hvi.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object P(xx6 xx6Var, lq4 lq4Var) {
        f07 f07Var;
        wfe wfeVarP;
        AbortFlowException e2;
        a07 a07Var;
        if (lq4Var instanceof f07) {
            f07Var = (f07) lq4Var;
            int i = f07Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                f07Var.g = i - Integer.MIN_VALUE;
            } else {
                f07Var = new f07(lq4Var);
            }
        } else {
            f07Var = new f07(lq4Var);
        }
        Object obj = f07Var.f;
        int i2 = f07Var.g;
        if (i2 == 0) {
            wfeVarP = nbh.p(obj);
            a07 a07Var2 = new a07(1, wfeVarP);
            try {
                f07Var.d = wfeVarP;
                f07Var.e = a07Var2;
                f07Var.g = 1;
                Object objCollect = xx6Var.collect(a07Var2, f07Var);
                Object obj2 = hu4.a;
                if (objCollect == obj2) {
                    return obj2;
                }
            } catch (AbortFlowException e3) {
                e2 = e3;
                a07Var = a07Var2;
                if (e2.a == a07Var) {
                    throw e2;
                }
                vd7.q(f07Var.getContext());
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a07Var = f07Var.e;
            wfeVarP = f07Var.d;
            try {
                ch3.d0(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.a == a07Var) {
                    throw e2;
                }
                vd7.q(f07Var.getContext());
            }
        }
        return wfeVarP.a;
    }

    public static void P0(int i, int i2, int i3) {
        String strQ0;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strQ0 = Q0(i, i3, "start index");
            } else {
                strQ0 = (i2 < 0 || i2 > i3) ? Q0(i2, i3, "end index") : hvi.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strQ0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Q(r8e r8eVar, nb4 nb4Var, nq4 nq4Var) {
        g07 g07Var;
        wfe wfeVar;
        AbortFlowException e2;
        he heVar;
        if (nq4Var instanceof g07) {
            g07Var = (g07) nq4Var;
            int i = g07Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                g07Var.g = i - Integer.MIN_VALUE;
            } else {
                g07Var = new g07(nq4Var);
            }
        } else {
            g07Var = new g07(nq4Var);
        }
        Object obj = g07Var.f;
        int i2 = g07Var.g;
        if (i2 == 0) {
            wfe wfeVarP = nbh.p(obj);
            he heVar2 = new he(nb4Var, 29, wfeVarP);
            try {
                g07Var.d = wfeVarP;
                g07Var.e = heVar2;
                g07Var.g = 1;
                Object objCollect = r8eVar.a.collect(heVar2, g07Var);
                hu4 hu4Var = hu4.a;
                if (objCollect == hu4Var) {
                    return hu4Var;
                }
                wfeVar = wfeVarP;
            } catch (AbortFlowException e3) {
                wfeVar = wfeVarP;
                e2 = e3;
                heVar = heVar2;
                if (e2.a == heVar) {
                    throw e2;
                }
                vd7.q(g07Var.getContext());
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            heVar = g07Var.e;
            wfeVar = g07Var.d;
            try {
                ch3.d0(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.a == heVar) {
                    throw e2;
                }
                vd7.q(g07Var.getContext());
            }
        }
        return wfeVar.a;
    }

    public static String Q0(int i, int i2, String str) {
        if (i < 0) {
            return hvi.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return hvi.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ore.p(zo5.h(i2, "negative size: "));
        return null;
    }

    public static final jz R(xx6 xx6Var, qf7 qf7Var) {
        int i = zz6.a;
        return new jz(new fz6(xx6Var, qf7Var, 2), 12);
    }

    public static final xx6 S(xx6 xx6Var, int i) {
        int i2 = zz6.a;
        if (i > 0) {
            return i == 1 ? new jz(xx6Var, 12) : new pr2(i, -2, 1, k66.a, xx6Var);
        }
        c.o(zo5.h(i, "Expected positive concurrency level, but had "));
        return null;
    }

    public static final xx6 T(xx6 xx6Var, vt4 vt4Var) {
        if (vt4Var.x0(nhb.h) != null) {
            ore.e(vt4Var, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (vt4Var.equals(k66.a)) {
            return xx6Var;
        }
        return xx6Var instanceof ig7 ? wk8.m((ig7) xx6Var, vt4Var, 0, 0, 6) : new rr2(0, 0, 12, vt4Var, xx6Var);
    }

    public static final String U(Set set) {
        ArrayList arrayList = new ArrayList(yw3.W0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((i37) it.next()).name());
        }
        return new JSONArray((Collection) arrayList).toString();
    }

    public static final Map V(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (bArr == null) {
            return s66.a;
        }
        f67 f67Var = new f67(0);
        sia.mergeFrom(f67Var, bArr);
        EnumMap enumMap = new EnumMap(i37.class);
        long[] jArr = (long[]) f67Var.b;
        if (jArr.length == 0) {
            return enumMap;
        }
        enumMap.put(i37.ORG, jArr);
        return enumMap;
    }

    public static final List W(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (bArr == null) {
            return r66.a;
        }
        f67 f67Var = new f67(2);
        sia.mergeFrom(f67Var, bArr);
        g67[] g67VarArr = (g67[]) f67Var.b;
        ArrayList arrayList = new ArrayList(g67VarArr.length);
        for (g67 g67Var : g67VarArr) {
            long j = g67Var.a;
            String str = g67Var.b;
            String str2 = g67Var.c;
            String str3 = g67Var.d;
            String str4 = str3.length() == 0 ? null : str3;
            long j2 = g67Var.e;
            Long lValueOf = Long.valueOf(j2);
            if (j2 == -1) {
                lValueOf = null;
            }
            String str5 = g67Var.f;
            String str6 = str5.length() == 0 ? null : str5;
            String str7 = g67Var.g;
            String str8 = str7.length() == 0 ? null : str7;
            String str9 = g67Var.h;
            arrayList.add(new f47(j, str, str2, str4, lValueOf, str9.length() == 0 ? null : str9, str6, str8));
        }
        return arrayList;
    }

    public static final HashSet X(String str) {
        HashSet hashSet = new HashSet();
        try {
            Iterator it = r5h.m1(str, new String[]{","}, 6).iterator();
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
            return hashSet;
        } catch (Throwable th) {
            gm0.V("WorkersQueue/TagsTypeConverter", "fail to convert string to tags", th);
            return hashSet;
        }
    }

    public static final xx6 Y(lzf lzfVar, vt4 vt4Var, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? lzfVar : new rr2(i, i2, vt4Var, lzfVar);
    }

    public static final pzf a(int i, int i2, int i3) {
        if (i < 0) {
            c.o(zo5.h(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            c.o(zo5.h(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            c.o("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(qt4.G(i3)));
            return null;
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new pzf(i, i4, i3);
    }

    public static final Object a0(TextView textView, String str) {
        try {
            Field declaredField = textView.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(textView);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static /* synthetic */ pzf b(int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return a(i, i2, (i3 & 4) != 0 ? 1 : 2);
    }

    public static final long b0(qxe qxeVar) {
        if (e0(qxeVar) == 0) {
            return -1L;
        }
        vxe vxeVarO0 = qxeVar.O0("SELECT last_insert_rowid()");
        try {
            vxeVarO0.M0();
            long j = vxeVarO0.getLong(0);
            p90.f(vxeVarO0, null);
            return j;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public static final Object c(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static float c0(int i, String[] strArr) {
        float f2 = Float.parseFloat(strArr[i]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static final void d(fbc fbcVar, List list) {
        fbcVar.u(qyj.W(list).toString(), "session_states");
    }

    public static final PackageInfo d0(PackageManager packageManager, String str) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0);
    }

    public static final void e(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final int e0(qxe qxeVar) {
        vxe vxeVarO0 = qxeVar.O0("SELECT changes()");
        try {
            vxeVarO0.M0();
            int i = (int) vxeVarO0.getLong(0);
            p90.f(vxeVarO0, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public static final String f(Object[] objArr, int i, int i2, w2 w2Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == w2Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void f0(vt4 vt4Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).a;
        }
        try {
            yt4 yt4Var = (yt4) vt4Var.x0(nhb.f);
            if (yt4Var != null) {
                yt4Var.r0(vt4Var, th);
            } else {
                spl.b(vt4Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                gm0.b(runtimeException, th);
                th = runtimeException;
            }
            spl.b(vt4Var, th);
        }
    }

    public static boolean g0(int i, Object obj) {
        int arity;
        if (obj instanceof uf7) {
            if (obj instanceof dg7) {
                arity = ((dg7) obj).getArity();
            } else if (obj instanceof af7) {
                arity = 0;
            } else if (obj instanceof cf7) {
                arity = 1;
            } else if (obj instanceof qf7) {
                arity = 2;
            } else if (obj instanceof tf7) {
                arity = 3;
            } else if (obj instanceof vf7) {
                arity = 4;
            } else if (obj instanceof wf7) {
                arity = 5;
            } else {
                arity = obj instanceof xf7 ? 6 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean h0(View view) {
        WeakHashMap weakHashMap = i7j.a;
        return view.getLayoutDirection() == 1;
    }

    public static List i(Object obj) {
        if ((obj instanceof uv8) && !(obj instanceof wv8)) {
            I0(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            cqk.J(e2, e9i.class.getName());
            throw e2;
        }
    }

    public static boolean i0(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static Map j(Map map) {
        if (!(map instanceof uv8) || (map instanceof ul9)) {
            return map;
        }
        I0(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static final sgg j0(xx6 xx6Var, gu4 gu4Var) {
        return yab.i0(gu4Var, null, 0, new ky6(xx6Var, null, 1), 3);
    }

    public static s30 k() throws InterruptedException {
        s30 s30Var = s30.l.f;
        if (s30Var == null) {
            long jNanoTime = System.nanoTime();
            s30.i.await(s30.j, TimeUnit.MILLISECONDS);
            if (s30.l.f != null || System.nanoTime() - jNanoTime < s30.k) {
                return null;
            }
            return s30.l;
        }
        long jNanoTime2 = s30Var.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            s30.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        s30.l.f = s30Var.f;
        s30Var.f = null;
        return s30Var;
    }

    public static final ur2 k0(xx6 xx6Var, qf7 qf7Var) {
        int i = zz6.a;
        return M0(xx6Var, new vm1(qf7Var, (lq4) null, 4));
    }

    public static void l(int i, Object obj) {
        if (obj == null || g0(i, obj)) {
            return;
        }
        I0(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static int l0(int i, int... iArr) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static xx6 m(xx6 xx6Var, int i, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if (i < 0 && i != -2 && i != -1) {
            c.o(zo5.h(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            i3 = 2;
        } else {
            i3 = 1;
        }
        int i4 = i;
        return xx6Var instanceof ig7 ? wk8.m((ig7) xx6Var, null, i4, i3, 1) : new rr2(i4, i3, 2, null, xx6Var);
    }

    public static final nr2 m0(xx6... xx6VarArr) {
        int i = zz6.a;
        return new nr2(xx6VarArr.length == 0 ? r66.a : new rw(0, xx6VarArr), k66.a, -2, 1, 1);
    }

    public static final ArrayList n(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ArrayList arrayList = new ArrayList();
        while (byteBufferWrap.remaining() >= 8) {
            arrayList.add(Long.valueOf(byteBufferWrap.getLong()));
        }
        return arrayList;
    }

    public static hu7 n0(String... strArr) {
        if (strArr.length % 2 != 0) {
            ore.p("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                ore.p("Headers cannot be null");
                return null;
            }
            strArr2[i2] = r5h.y1(str).toString();
        }
        int iS = wk8.s(0, strArr2.length - 1, 2);
        if (iS >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                u(str2);
                x(str3, str2);
                if (i == iS) {
                    break;
                }
                i += 2;
            }
        }
        return new hu7(strArr2);
    }

    public static final q72 o(qf7 qf7Var) {
        return new q72(qf7Var, k66.a, -2, 1);
    }

    public static PorterDuff.Mode o0(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final fk2 p(xx6 xx6Var) {
        if (!(xx6Var instanceof fk2)) {
            xx6Var = new hk2(xx6Var);
        }
        return (fk2) xx6Var;
    }

    public static int p0(InputStream inputStream, byte[] bArr, int i) throws IOException {
        inputStream.getClass();
        int i2 = 0;
        if (i < 0) {
            c.r("len is negative");
            return 0;
        }
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable q(xx6 xx6Var, yx6 yx6Var, nq4 nq4Var) throws Throwable {
        hz6 hz6Var;
        wfe wfeVar;
        Throwable th;
        vo8 vo8Var;
        CancellationException cancellationExceptionA;
        if (nq4Var instanceof hz6) {
            hz6Var = (hz6) nq4Var;
            int i = hz6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hz6Var.f = i - Integer.MIN_VALUE;
            } else {
                hz6Var = new hz6(nq4Var);
            }
        } else {
            hz6Var = new hz6(nq4Var);
        }
        Object obj = hz6Var.e;
        int i2 = hz6Var.f;
        if (i2 != 0) {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wfeVar = hz6Var.d;
            try {
                ch3.d0(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
                th = (Throwable) wfeVar.a;
                if (th == null) {
                    if (th == null) {
                        return th;
                    }
                    if (th instanceof CancellationException) {
                        gm0.b(th, th);
                        throw th;
                    }
                    gm0.b(th, th);
                    throw th;
                }
                if (th == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    gm0.b(th, th);
                    throw th;
                }
                gm0.b(th, th);
                throw th;
                throw th;
            }
        }
        wfe wfeVarP = nbh.p(obj);
        try {
            yx6 vmbVar = new vmb(yx6Var, 7, wfeVarP);
            hz6Var.d = wfeVarP;
            hz6Var.f = 1;
            Object objCollect = xx6Var.collect(vmbVar, hz6Var);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            wfeVar = wfeVarP;
            th = (Throwable) wfeVar.a;
            if ((th == null && th.equals(th)) || ((vo8Var = (vo8) hz6Var.getContext().x0(nhb.h)) != null && vo8Var.isCancelled() && (cancellationExceptionA = vo8Var.A()) != null && cancellationExceptionA.equals(th))) {
                throw th;
            }
            if (th == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                gm0.b(th, th);
                throw th;
            }
            gm0.b(th, th);
            throw th;
        }
    }

    public static final ir2 q0(hr2 hr2Var) {
        return new ir2(hr2Var, false);
    }

    public static final nr2 r(qf7 qf7Var) {
        return new nr2(qf7Var, k66.a, -2, 1, 0);
    }

    public static final void r0(Object[] objArr, int i, int i2) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static void s(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ch9.b(qv1.p("startIndex: ", i, ", endIndex: ", i2, ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            ore.p(qt4.l("startIndex: ", i, i2, " > endIndex: "));
        }
    }

    public static TypedValue s0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final void t(WorkDatabase workDatabase, ja4 ja4Var, cyj cyjVar) {
        int i;
        ArrayList arrayListR0 = xw3.R0(cyjVar);
        int i2 = 0;
        while (!arrayListR0.isEmpty()) {
            List list = ((cyj) cx3.f1(arrayListR0)).q;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((WorkRequest) it.next()).getWorkSpec().j.i.isEmpty() && (i = i + 1) < 0) {
                        xw3.U0();
                        throw null;
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int iIntValue = ((Number) ch3.G(workDatabase.x().a, true, false, new hfj(4))).intValue();
        int i3 = ja4Var.j;
        if (iIntValue + i2 <= i3) {
            return;
        }
        ore.p(zo5.t(qv1.p("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i3, ";\nalready enqueued count: ", iIntValue, ";\ncurrent enqueue operation count: "), i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static boolean t0(int i, Context context, boolean z) {
        TypedValue typedValueS0 = s0(context, i);
        if (typedValueS0 == null || typedValueS0.type != 18) {
            return z;
        }
        return typedValueS0.data != 0;
    }

    public static void u(String str) {
        if (str.length() <= 0) {
            ore.p("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                c.o(uqi.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    public static int u0(int i, int i2, Context context) {
        TypedValue typedValueS0 = s0(context, i);
        return (typedValueS0 == null || typedValueS0.type != 16) ? i2 : typedValueS0.data;
    }

    public static void v(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ore.n(str);
    }

    public static TimeInterpolator v0(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            ore.p("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!i0(strValueOf, "cubic-bezier") && !i0(strValueOf, ClientCookie.PATH_ATTR)) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!i0(strValueOf, "cubic-bezier")) {
            if (i0(strValueOf, ClientCookie.PATH_ATTR)) {
                return egl.d(qyj.r(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            ore.p("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return egl.c(c0(0, strArrSplit), c0(1, strArrSplit), c0(2, strArrSplit), c0(3, strArrSplit));
        }
        qr7.p(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    public static void w(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ch9.b(qv1.p("fromIndex: ", i, ", toIndex: ", i2, ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            ore.p(qt4.l("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static final void w0(lq4 lq4Var, Object obj) throws DispatchException {
        if (!(lq4Var instanceof sn5)) {
            lq4Var.resumeWith(obj);
            return;
        }
        sn5 sn5Var = (sn5) lq4Var;
        xt4 xt4Var = sn5Var.d;
        nq4 nq4Var = sn5Var.e;
        Throwable thA = roe.a(obj);
        Object s64Var = thA == null ? obj : new s64(false, thA);
        if (A0(xt4Var, nq4Var.getContext())) {
            sn5Var.f = s64Var;
            sn5Var.c = 1;
            z0(xt4Var, nq4Var.getContext(), sn5Var);
            return;
        }
        nc6 nc6VarA = qqh.a();
        if (nc6VarA.c >= 4294967296L) {
            sn5Var.f = s64Var;
            sn5Var.c = 1;
            nc6VarA.T0(sn5Var);
            return;
        }
        nc6VarA.U0(true);
        try {
            vo8 vo8Var = (vo8) nq4Var.getContext().x0(nhb.h);
            if (vo8Var == null || vo8Var.isActive()) {
                Object obj2 = sn5Var.g;
                vt4 context = nq4Var.getContext();
                Object objI = np4.I(context, obj2);
                zai zaiVarF0 = objI != np4.d ? n1g.f0(nq4Var, context, objI) : null;
                try {
                    nq4Var.resumeWith(obj);
                    if (zaiVarF0 == null || zaiVarF0.p0()) {
                        np4.A(context, objI);
                    }
                } catch (Throwable th) {
                    if (zaiVarF0 == null || zaiVarF0.p0()) {
                        np4.A(context, objI);
                    }
                    throw th;
                }
            } else {
                sn5Var.resumeWith(new poe(vo8Var.A()));
            }
            while (nc6VarA.W0()) {
            }
        } catch (Throwable th2) {
            try {
                sn5Var.g(th2);
            } finally {
                nc6VarA.S0(true);
            }
        }
    }

    public static void x(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                c.o(uqi.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(uqi.q(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    public static final j3 x0(bye byeVar, long j, qf7 qf7Var) {
        if (j > 0) {
            return new j3(byeVar, 15, new jz6(j, qf7Var, null));
        }
        c.o(zo5.j(j, "Expected positive amount of retries, but had "));
        return null;
    }

    public static final Object y(xx6 xx6Var, mdh mdhVar) {
        Object objCollect = xx6Var.collect(fib.a, mdhVar);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }

    public static View y0(Context context, lcc lccVar, ncc nccVar) {
        if (lccVar instanceof hcc) {
            cyb cybVar = new cyb(context);
            hcc hccVar = (hcc) lccVar;
            cybVar.setIconResource(hccVar.a);
            cybVar.setAppearance(zxb.GHOST);
            cybVar.setSize(ayb.i);
            if (hccVar.b) {
                cybVar.setOnClickListener(new evh(hccVar, 0));
                return cybVar;
            }
            qe7.H(cybVar, 300L, new evh(hccVar, 1));
            return cybVar;
        }
        if (lccVar instanceof icc) {
            icc iccVar = (icc) lccVar;
            dyb dybVar = new dyb(context);
            dybVar.setButtonIcon(R.drawable.icon_edit);
            dybVar.a();
            dybVar.setBadgeVisible(iccVar.a);
            qe7.H(dybVar, 300L, new aah(2, iccVar));
            return dybVar;
        }
        if (!(lccVar instanceof jcc)) {
            if (!(lccVar instanceof kcc)) {
                if (lccVar == null) {
                    return null;
                }
                ore.o();
                return null;
            }
            t7c t7cVar = new t7c(context);
            t7cVar.setPadding(0, 0, 0, 0);
            t7cVar.setSearchButtonContentDescription(((kcc) lccVar).a);
            t7cVar.setListener(new u50(t7cVar, nccVar, lccVar));
            return t7cVar;
        }
        jcc jccVar = (jcc) lccVar;
        String str = jccVar.f;
        ynh ynhVar = jccVar.e;
        int i = jccVar.a;
        Drawable drawable = jccVar.b;
        if (str != null) {
            m5c m5cVar = new m5c(context);
            m5cVar.setMode(j5c.b);
            float f2 = jccVar.g;
            if (drawable != null) {
                m5cVar.b(drawable, str, f2);
            } else {
                m5cVar.a(f2, i, str);
            }
            m5cVar.setContentDescription(ynhVar.d(m5cVar));
            qe7.H(m5cVar, 300L, new aah(3, jccVar));
            return m5cVar;
        }
        z7c z7cVar = new z7c(context);
        z7cVar.setScaleType(ImageView.ScaleType.CENTER);
        if (drawable == null) {
            drawable = context.getDrawable(i);
        }
        z7cVar.setImageDrawable(drawable);
        int iK = gm0.K(jccVar.c * yl5.d().getDisplayMetrics().density);
        z7cVar.setPadding(iK, iK, iK, iK);
        z7cVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
        z7cVar.setOutlineProvider(new nt4(12.0f * yl5.d().getDisplayMetrics().density));
        z7cVar.setContentDescription(ynhVar.d(z7cVar));
        qe7.H(z7cVar, 300L, new ze3(6, jccVar));
        z7cVar.setClickable(true);
        return z7cVar;
    }

    public static final Object z(xx6 xx6Var, qf7 qf7Var, mdh mdhVar) {
        Object objY = y(m(k0(xx6Var, qf7Var), 0, 2), mdhVar);
        return objY == hu4.a ? objY : sbi.a;
    }

    public static final void z0(xt4 xt4Var, vt4 vt4Var, Runnable runnable) throws DispatchException {
        try {
            xt4Var.D0(vt4Var, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, xt4Var, vt4Var);
        }
    }

    public Object Z(Object obj, Object obj2) {
        return null;
    }

    public abstract boolean g(Object obj, Object obj2);

    public abstract boolean h(Object obj, Object obj2);
}
