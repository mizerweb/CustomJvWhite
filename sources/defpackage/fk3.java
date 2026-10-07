package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fk3 extends a8j {
    public static final /* synthetic */ zv8[] y1 = {new z8b(fk3.class, "processSearchResultJob", "getProcessSearchResultJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, fk3.class, "keyboardWaitingJob", "getKeyboardWaitingJob()Lkotlinx/coroutines/Job;"), new z8b(fk3.class, "unblockContactJob", "getUnblockContactJob()Lkotlinx/coroutines/Job;"), new z8b(fk3.class, "chatListSearchActionJob", "getChatListSearchActionJob()Lkotlinx/coroutines/Job;"), new z8b(fk3.class, "trailingButtonClickedJob", "getTrailingButtonClickedJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public final mjg E;
    public final r8e F;
    public final mjg G;
    public final mjg H;
    public final mjg I;
    public final ic6 J;
    public final ic6 K;
    public final ic6 X;
    public final AtomicReference Y;
    public final String Z;
    public final iae c;
    public final un4 d;
    public final yn3 e;
    public final i9f f;
    public final xhh g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final xt4 n1;
    public final ny8 o;
    public final zt4 o1;
    public final ny8 p;
    public sgg p1;
    public final ny8 q;
    public sgg q1;
    public final ny8 r;
    public sgg r1;
    public final ny8 s;
    public final p3c s1;
    public final ny8 t;
    public final p3c t1;
    public final ny8 u;
    public final p3c u1;
    public final ny8 v;
    public final p3c v1;
    public final ny8 w;
    public final p3c w1;
    public final ny8 x;
    public final ifh x1;
    public final ny8 y;
    public final ny8 z;

    public fk3(iae iaeVar, un4 un4Var, yn3 yn3Var, i9f i9fVar, xhh xhhVar, yt4 yt4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18, ny8 ny8Var19, ny8 ny8Var20, ny8 ny8Var21, ny8 ny8Var22, ny8 ny8Var23, ny8 ny8Var24, ny8 ny8Var25, ny8 ny8Var26) throws IllegalAccessException, InvocationTargetException {
        this.c = iaeVar;
        this.d = un4Var;
        this.e = yn3Var;
        this.f = i9fVar;
        this.g = xhhVar;
        this.h = ny8Var2;
        this.i = ny8Var6;
        this.j = ny8Var7;
        this.k = ny8Var3;
        this.l = ny8Var4;
        this.m = ny8Var5;
        this.n = ny8Var;
        this.o = ny8Var8;
        this.p = ny8Var9;
        this.q = ny8Var10;
        this.r = ny8Var11;
        this.s = ny8Var12;
        this.t = ny8Var13;
        this.u = ny8Var14;
        this.v = ny8Var15;
        this.w = ny8Var19;
        this.x = ny8Var20;
        this.y = ny8Var21;
        this.z = ny8Var22;
        this.A = ny8Var23;
        this.B = ny8Var24;
        this.C = ny8Var25;
        this.D = ny8Var26;
        mjg mjgVarA = p90.a(jj3.h);
        this.E = mjgVarA;
        this.F = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(null);
        this.G = mjgVarA2;
        mjg mjgVarA3 = p90.a(Boolean.FALSE);
        this.H = mjgVarA3;
        mjg mjgVarA4 = p90.a(null);
        this.I = mjgVarA4;
        this.J = new ic6(null);
        this.K = new ic6(null);
        this.X = new ic6(null);
        this.Y = new AtomicReference(null);
        this.Z = fk3.class.getName();
        n0c n0cVar = (n0c) xhhVar;
        this.n1 = n0cVar.b().R0(1, "ChatsListSearchViewModelDispatcher");
        this.o1 = new zt4(yt4Var, oj3.a);
        this.s1 = qyj.S();
        this.t1 = qyj.S();
        this.u1 = qyj.S();
        this.v1 = qyj.S();
        xx6 xx6VarF = e9i.F(e9i.K(mjgVarA2, 1), 300L);
        e9i.j0(new fz6(e9i.T(e9i.A(xx6VarF, e9i.F(mjgVarA3, 200L), new fz6(e9i.M0(new bye(new je0((l8f) ny8Var16.getValue(), xx6VarF, new tz(7, null), 0, (lq4) null)), new k7((gq0) ny8Var11.getValue(), E(), (lq4) null, 2)), new dk3(2, null, 0)), new fz6(new bye(new je0((d9f) ny8Var17.getValue(), xx6VarF, new tz(7, null), Math.max(5, (int) ((Number) ((g5d) ((gjf) ny8Var7.getValue())).a.s4.a(e5d.S6[280]).i()).longValue()), (lq4) null)), new dk3(2, null, 1)), new fz6(new bye(new je0((w8f) ny8Var18.getValue(), xx6VarF, mjgVarA4, 50, (lq4) null)), new dk3(2, null, 2)), new ek3(this, null)), n0cVar.b()), new ke3(this, (lq4) null, 2), 3), this.b);
        G();
        this.w1 = qyj.S();
        this.x1 = new ifh(new za2(this, 18, ny8Var24));
    }

    public static final void B(fk3 fk3Var, long j, long j2) {
        xn3 xn3VarE = fk3Var.E();
        xn3VarE.j().W(j, ew5.g(j2) + ((s7f) ((et3) fk3Var.i.getValue())).f());
    }

    public static final List C(fk3 fk3Var) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = (JSONObject) ((g5d) ((gjf) fk3Var.j.getValue())).a.Y1.a(e5d.S6[153]).i();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray(CallAnalyticsApiRequest.KEY_ITEMS)) == null) {
            return r66.a;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
            long j = jSONObject2.getLong("id");
            String strOptString = jSONObject2.optString("icon");
            String string = jSONObject2.getString("title");
            arrayList.add(new s9e(j, string, strOptString, r5h.u1(2, string), false, false, 176));
        }
        return arrayList;
    }

    public static final void D(fk3 fk3Var, long j, boolean z) {
        xt4 xt4VarB = ((n0c) fk3Var.g).b();
        zt4 zt4Var = fk3Var.o1;
        xt4VarB.getClass();
        fk3Var.u1.B(fk3Var, y1[2], yab.h0(fk3Var.b, lvb.x0(xt4VarB, zt4Var), 2, new c03(fk3Var, j, z, null, 2)));
    }

    public final xn3 E() {
        return (xn3) this.k.getValue();
    }

    public final boolean F() {
        String str;
        ulc ulcVar = (ulc) this.Y.get();
        return (ulcVar == null || (str = (String) ulcVar.d) == null || !(r5h.X0(str) ^ true)) ? false : true;
    }

    public final void G() throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.p1;
        if (sggVar == null || !sggVar.isActive()) {
            this.G.setValue(null);
            this.I.setValue(null);
            sgg sggVar2 = this.q1;
            if (sggVar2 != null) {
                sggVar2.b(null);
            }
            vo8 vo8Var = (vo8) this.s1.m(this, y1[0]);
            if (vo8Var != null) {
                vo8Var.b(null);
            }
            boolean z = this.p1 != null;
            xt4 xt4Var = this.n1;
            xt4Var.getClass();
            this.p1 = yab.i0(this.b, lvb.x0(xt4Var, this.o1), 0, new qj3(this, z, null), 2);
        }
    }

    public final void H(y8f y8fVar) {
        a8j.t(this, ((n0c) this.g).a(), new jd3(this, y8fVar, (lq4) null, 2), 2);
    }

    public final void I(long j) {
        yab.i0(this.b, ((n0c) this.g).a(), 0, new xj3(2, j, this, null), 2);
        rt2 rt2VarO = E().o(j);
        a8j.x(this.J, rt2VarO != null ? zm3.k(zm3.b, rt2VarO.a, d93.SEARCH, null, 10) : zm3.b.x(j));
    }

    public final void J() {
        Map mapB;
        String str = (String) this.G.getValue();
        jj3 jj3Var = (jj3) this.E.getValue();
        r9f r9fVar = (r9f) this.z.getValue();
        int size = jj3Var.d.size();
        l48 l48Var = jj3Var.c;
        int size2 = l48Var.b.size();
        int size3 = l48Var.c.size();
        r9fVar.getClass();
        ul9 ul9Var = new ul9();
        if (str == null || r5h.X0(str)) {
            if (size2 > 0) {
                ul9Var.put("RECENTS", Integer.valueOf(size2));
            }
            if (size3 > 0) {
                ul9Var.put("ALL_CONTACTS", Integer.valueOf(size3));
            }
        }
        if (size > 0) {
            ul9Var.put("LOCAL_SEARCH", Integer.valueOf(size));
        }
        ul9 ul9VarB = ul9Var.b();
        if ((str == null || r5h.X0(str)) && ul9VarB.isEmpty()) {
            mapB = s66.a;
        } else {
            ul9 ul9Var2 = new ul9();
            if (!ul9VarB.isEmpty()) {
                ul9Var2.put("counters", ul9VarB);
            }
            if (str != null && (!r5h.X0(str))) {
                ul9Var2.put("inputQuery", str);
            }
            mapB = ul9Var2.b();
        }
        ae9.k((ae9) r9fVar.a.getValue(), "SHOW", "SEARCH_RESPONSE", mapB, 8);
    }

    public final void K() {
        a8j.x(this.K, new r3g(new tnh(R.string.snack_network_error_title), null, new tnh(R.string.snack_network_error_description), 2));
    }

    public final void L(long j) {
        xt4 xt4VarB = ((n0c) this.g).b();
        zhb zhbVar = zhb.b;
        xt4VarB.getClass();
        yab.h0(this.b, lvb.x0(xt4VarB, zhbVar), 3, new pj3(1, j, this, null));
    }

    @Override // defpackage.a8j
    public final void y() throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.p1;
        if (sggVar != null) {
            sggVar.b(null);
        }
        sgg sggVar2 = this.q1;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
    }
}
