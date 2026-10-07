package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Collection;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class u92 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final wme f;
    public final wme g;
    public final wme h;
    public final wme i;
    public final String j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;

    public u92(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, pa4 pa4Var) {
        this.a = ny8Var4;
        this.b = ny8Var5;
        this.c = ny8Var3;
        this.d = ny8Var2;
        this.e = ny8Var6;
        this.f = new wme(new w40(ny8Var, 7));
        this.g = new wme(new w40(ny8Var, 8));
        this.h = new wme(new w40(ny8Var, 9));
        wme wmeVar = new wme(new w40(ny8Var, 10));
        this.i = wmeVar;
        this.j = (String) wmeVar.getValue();
        this.k = rx8.P(3, new k82(2));
        this.l = rx8.P(3, new k82(3));
        this.m = rx8.P(3, new w40(ny8Var, 11));
        pa4Var.a(pa4.d | pa4.e, new ql1(1, this));
    }

    public static htc c(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap) {
        IconCompat iconCompat;
        if (r5h.X0(charSequence)) {
            charSequence = !r5h.X0(charSequence2) ? charSequence2 : "...";
        }
        if (bitmap != null) {
            iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
        } else {
            iconCompat = null;
        }
        htc htcVar = new htc();
        htcVar.a = charSequence;
        htcVar.b = iconCompat;
        htcVar.c = null;
        htcVar.d = true;
        return htcVar;
    }

    public static qlb e(Context context, String str) {
        qlb qlbVar = new qlb(context, str);
        qlbVar.k = -1;
        if (Build.VERSION.SDK_INT >= 31) {
            qlbVar.E = 1;
        }
        return qlbVar;
    }

    public final void a(qlb qlbVar, CharSequence charSequence, Bitmap bitmap, boolean z, be1 be1Var, String str) {
        so1 so1VarF = f();
        PendingIntent pendingIntentA = so1VarF.a(so1VarF.c(), str.hashCode(), new ro1(so1VarF, be1Var, z, str, 0));
        if (pendingIntentA == null) {
            gm0.Y("CallsNotification", "Early return in applyIncomingCallStyleToNotification cuz of acceptCallPending is null");
            return;
        }
        so1 so1VarF2 = f();
        PendingIntent pendingIntentA2 = so1VarF2.a(so1VarF2.c(), str.hashCode(), new qo1(str, 2));
        if (pendingIntentA2 == null) {
            gm0.Y("CallsNotification", "Early return in applyIncomingCallStyleToNotification cuz of rejectCallPending is null");
        } else {
            qlbVar.i(new vlb(1, c(charSequence, z ? (String) this.h.getValue() : (String) this.g.getValue(), bitmap), null, pendingIntentA2, pendingIntentA));
        }
    }

    public final qlb b(Context context, CharSequence charSequence, be1 be1Var, boolean z, String str) {
        ((d95) this.c.getValue()).getClass();
        qlb qlbVarE = e(context, "ru.oneme.app.new.incomingCalls.");
        qlbVarE.G.icon = z ? ((Number) this.l.getValue()).intValue() : ((Number) this.k.getValue()).intValue();
        qlbVarE.e = qlb.c(charSequence);
        qlbVarE.f = qlb.c(z ? (String) this.h.getValue() : (String) this.g.getValue());
        qlbVarE.k = 2;
        qlbVarE.f(2, true);
        so1 so1VarF = f();
        so1VarF.getClass();
        qlbVarE.h = so1VarF.a(context, str.hashCode(), new ro1(so1VarF, be1Var, z, str, 1));
        qlbVarE.f(np0.m, true);
        qlbVarE.l = false;
        qlbVarE.w = "call";
        return qlbVarE;
    }

    public final Notification d(Context context, be1 be1Var, boolean z, boolean z2) {
        String str;
        gm0.n("CallsNotification", "createTempNotification");
        CharSequence charSequence = be1Var.d;
        if (charSequence == null) {
            charSequence = (String) this.f.getValue();
        }
        if (z2) {
            str = z ? (String) this.h.getValue() : (String) this.g.getValue();
        } else {
            str = this.j;
        }
        int iIntValue = z ? ((Number) this.l.getValue()).intValue() : ((Number) this.k.getValue()).intValue();
        ((d95) this.c.getValue()).getClass();
        qlb qlbVarE = e(context, "ru.oneme.app.new.incomingCalls.");
        qlbVarE.G.icon = iIntValue;
        qlbVarE.e = qlb.c(charSequence);
        qlbVarE.f = qlb.c(str);
        return qlbVarE.a();
    }

    public final so1 f() {
        return (so1) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0152  */
    /* JADX WARN: Code duplicated, block: B:203:0x0258  */
    /* JADX WARN: Code duplicated, block: B:205:0x0260  */
    /* JADX WARN: Code duplicated, block: B:209:0x026b  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object g(be1 be1Var, boolean z, nq4 nq4Var) {
        o92 o92Var;
        String string;
        String strK;
        lq4 lq4Var;
        int length;
        int length2;
        String strK2;
        Bitmap bitmap;
        a4c a4cVar;
        je9 je9Var;
        boolean z2;
        je9 je9Var2 = je9.d;
        if (nq4Var instanceof o92) {
            o92Var = (o92) nq4Var;
            int i = o92Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                o92Var.f = i - Integer.MIN_VALUE;
            } else {
                o92Var = new o92(this, nq4Var);
            }
        } else {
            o92Var = new o92(this, nq4Var);
        }
        Object objK0 = o92Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = o92Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            if (!z || be1Var.l || be1Var.m != null || be1Var.h) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    String str = be1Var.e;
                    boolean z3 = !(str == null || str.length() == 0);
                    Object obj = be1Var.g;
                    if (obj == null) {
                        string = null;
                    } else if (gm0.c()) {
                        string = obj.toString();
                    } else if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        if (collection.isEmpty()) {
                            string = "[]";
                        } else {
                            length2 = collection.size();
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof Map) {
                        Map map = (Map) obj;
                        if (map.isEmpty()) {
                            string = "{}";
                        } else {
                            strK2 = c0a.k(map.size(), "{**", "**}");
                            string = strK2;
                        }
                    } else if (obj instanceof Object[]) {
                        Object[] objArr = (Object[]) obj;
                        if (objArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = objArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        if (iArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = iArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        if (fArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = fArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        if (jArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = jArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        if (dArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = dArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        if (sArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = sArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        if (bArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = bArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        if (cArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = cArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        if (zArr.length == 0) {
                            string = "[]";
                        } else {
                            length2 = zArr.length;
                            strK2 = c0a.k(length2, "[**", "**]");
                            string = strK2;
                        }
                    } else {
                        string = "***";
                    }
                    Object obj2 = be1Var.d;
                    if (obj2 == null) {
                        strK = null;
                    } else if (gm0.c()) {
                        strK = obj2.toString();
                    } else if (obj2 instanceof Collection) {
                        Collection collection2 = (Collection) obj2;
                        if (collection2.isEmpty()) {
                            strK = "[]";
                        } else {
                            length = collection2.size();
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof Map) {
                        Map map2 = (Map) obj2;
                        strK = map2.isEmpty() ? "{}" : c0a.k(map2.size(), "{**", "**}");
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr2 = (Object[]) obj2;
                        if (objArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = objArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof int[]) {
                        int[] iArr2 = (int[]) obj2;
                        if (iArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = iArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof float[]) {
                        float[] fArr2 = (float[]) obj2;
                        if (fArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = fArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof long[]) {
                        long[] jArr2 = (long[]) obj2;
                        if (jArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = jArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof double[]) {
                        double[] dArr2 = (double[]) obj2;
                        if (dArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = dArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof short[]) {
                        short[] sArr2 = (short[]) obj2;
                        if (sArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = sArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof byte[]) {
                        byte[] bArr2 = (byte[]) obj2;
                        if (bArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = bArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof char[]) {
                        char[] cArr2 = (char[]) obj2;
                        if (cArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = cArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else if (obj2 instanceof boolean[]) {
                        boolean[] zArr2 = (boolean[]) obj2;
                        if (zArr2.length == 0) {
                            strK = "[]";
                        } else {
                            length = zArr2.length;
                            strK = c0a.k(length, "[**", "**]");
                        }
                    } else {
                        strK = "***";
                    }
                    lq4Var = null;
                    a4cVar2.c(je9Var2, "CallsNotification", s5h.x0("\n                    Process notification bitmap:\n                        hasAvatar = " + z3 + ";\n                        abbreviation = " + string + ";\n                        pushName = " + strK + ";\n                "), null);
                } else {
                    lq4Var = null;
                }
                xt4 xt4VarB = ((n0c) ((xhh) this.a.getValue())).b();
                p92 p92Var = new p92(be1Var, this, lq4Var, 1);
                o92Var.f = 1;
                objK0 = yab.K0(xt4VarB, p92Var, o92Var);
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
            } else {
                bitmap = (Bitmap) this.m.getValue();
            }
            if (bitmap == null && !bitmap.isRecycled()) {
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, "CallsNotification", "Call notification image loaded successfully", null);
                }
                return bitmap;
            }
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    if (bitmap == null && bitmap.isRecycled()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a4cVar.c(je9Var, "CallsNotification", zo5.s("Couldn't load call notification image or placeholder. It's recycled = ", z2), null);
                    return null;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objK0);
        bitmap = (Bitmap) objK0;
        if (bitmap == null) {
        }
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                if (bitmap == null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                a4cVar.c(je9Var, "CallsNotification", zo5.s("Couldn't load call notification image or placeholder. It's recycled = ", z2), null);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object h(Context context, be1 be1Var, long j, String str, nq4 nq4Var) {
        q92 q92Var;
        long j2;
        CharSequence charSequence;
        Context context2;
        String str2;
        if (nq4Var instanceof q92) {
            q92Var = (q92) nq4Var;
            int i = q92Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                q92Var.j = i - Integer.MIN_VALUE;
            } else {
                q92Var = new q92(this, nq4Var);
            }
        } else {
            q92Var = new q92(this, nq4Var);
        }
        Object obj = q92Var.h;
        int i2 = q92Var.j;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.n("CallsNotification", "showActiveCallNotification");
            CharSequence charSequence2 = be1Var.d;
            if (charSequence2 == null) {
                charSequence2 = (String) this.f.getValue();
            }
            q92Var.d = context;
            q92Var.e = str;
            q92Var.f = charSequence2;
            j2 = j;
            q92Var.g = j2;
            q92Var.j = 1;
            Object objG = g(be1Var, false, q92Var);
            Object obj2 = hu4.a;
            if (objG == obj2) {
                return obj2;
            }
            CharSequence charSequence3 = charSequence2;
            obj = objG;
            charSequence = charSequence3;
            context2 = context;
            str2 = str;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = q92Var.g;
            charSequence = q92Var.f;
            str2 = q92Var.e;
            context2 = q92Var.d;
            ch3.d0(obj);
            j2 = j3;
        }
        Bitmap bitmap = (Bitmap) obj;
        ((d95) this.c.getValue()).getClass();
        qlb qlbVarE = e(context2, "ru.oneme.app.new.activeCalls");
        int iIntValue = ((Number) this.k.getValue()).intValue();
        Notification notification = qlbVarE.G;
        notification.icon = iIntValue;
        String str3 = this.j;
        qlbVarE.f = qlb.c(str3);
        qlbVarE.e = qlb.c(charSequence);
        so1 so1VarF = f();
        qlbVarE.g = so1VarF.a(so1VarF.c(), str2.hashCode(), new qo1(str2, 3));
        qlbVarE.f(2, true);
        qlbVarE.l = false;
        notification.when = j2;
        so1 so1VarF2 = f();
        qlbVarE.h = so1VarF2.a(so1VarF2.c(), str2.hashCode(), new qo1(str2, 3));
        qlbVarE.f(np0.m, false);
        so1 so1VarF3 = f();
        PendingIntent pendingIntentA = so1VarF3.a(so1VarF3.c(), str2.hashCode(), new qo1(str2, 0));
        if (pendingIntentA == null) {
            gm0.Y("CallsNotification", "Early return in applyActiveCallStyleToNotification cuz of finishedCallPending is null");
        } else {
            qlbVarE.i(new vlb(2, c(charSequence, str3, bitmap), pendingIntentA, null, null));
        }
        return qlbVarE.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object i(Context context, be1 be1Var, String str, nq4 nq4Var) {
        r92 r92Var;
        CharSequence charSequence;
        Context context2;
        String str2;
        if (nq4Var instanceof r92) {
            r92Var = (r92) nq4Var;
            int i = r92Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                r92Var.i = i - Integer.MIN_VALUE;
            } else {
                r92Var = new r92(this, nq4Var);
            }
        } else {
            r92Var = new r92(this, nq4Var);
        }
        Object obj = r92Var.g;
        int i2 = r92Var.i;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.n("CallsNotification", "showHeldCallNotification");
            CharSequence charSequence2 = be1Var.d;
            if (charSequence2 == null) {
                charSequence2 = (String) this.f.getValue();
            }
            r92Var.d = context;
            r92Var.e = str;
            r92Var.f = charSequence2;
            r92Var.i = 1;
            Object objG = g(be1Var, false, r92Var);
            Object obj2 = hu4.a;
            if (objG == obj2) {
                return obj2;
            }
            CharSequence charSequence3 = charSequence2;
            obj = objG;
            charSequence = charSequence3;
            context2 = context;
            str2 = str;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence = r92Var.f;
            str2 = r92Var.e;
            context2 = r92Var.d;
            ch3.d0(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        String string = context2.getString(R.string.call_notification_held_call);
        ((d95) this.c.getValue()).getClass();
        qlb qlbVarE = e(context2, "ru.oneme.app.new.activeCalls");
        qlbVarE.G.icon = ((Number) this.k.getValue()).intValue();
        qlbVarE.e = qlb.c(charSequence);
        qlbVarE.f = qlb.c(string);
        so1 so1VarF = f();
        qlbVarE.g = so1VarF.a(so1VarF.c(), str2.hashCode(), new qo1(str2, 1));
        qlbVarE.f(2, true);
        qlbVarE.l = false;
        qlbVarE.w = "call";
        so1 so1VarF2 = f();
        qlbVarE.h = so1VarF2.a(so1VarF2.c(), str2.hashCode(), new qo1(str2, 1));
        qlbVarE.f(np0.m, false);
        so1 so1VarF3 = f();
        PendingIntent pendingIntentA = so1VarF3.a(so1VarF3.c(), str2.hashCode(), new qo1(str2, 0));
        if (pendingIntentA == null) {
            gm0.Y("CallsNotification", "Early return in applyHeldCallStyleToNotification cuz of finishedCallPending is null");
        } else {
            qlbVarE.i(new vlb(2, c(charSequence, string, bitmap), pendingIntentA, null, null));
        }
        return qlbVarE.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Context context, be1 be1Var, boolean z, String str, nq4 nq4Var) {
        s92 s92Var;
        Context context2;
        String str2;
        CharSequence charSequence;
        be1 be1Var2;
        boolean z2;
        if (nq4Var instanceof s92) {
            s92Var = (s92) nq4Var;
            int i = s92Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s92Var.k = i - Integer.MIN_VALUE;
            } else {
                s92Var = new s92(this, nq4Var);
            }
        } else {
            s92Var = new s92(this, nq4Var);
        }
        Object obj = s92Var.i;
        int i2 = s92Var.k;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.n("CallsNotification", "showHiddenIncomingCallNotification");
            CharSequence charSequence2 = be1Var.d;
            if (charSequence2 == null) {
                charSequence2 = (String) this.f.getValue();
            }
            CharSequence charSequence3 = charSequence2;
            s92Var.d = context;
            s92Var.e = be1Var;
            s92Var.f = str;
            s92Var.g = charSequence3;
            s92Var.h = z;
            s92Var.k = 1;
            Object objG = g(be1Var, true, s92Var);
            Object obj2 = hu4.a;
            if (objG == obj2) {
                return obj2;
            }
            context2 = context;
            str2 = str;
            obj = objG;
            charSequence = charSequence3;
            be1Var2 = be1Var;
            z2 = z;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = s92Var.h;
            CharSequence charSequence4 = s92Var.g;
            str2 = s92Var.f;
            be1 be1Var3 = s92Var.e;
            Context context3 = s92Var.d;
            ch3.d0(obj);
            z2 = z3;
            context2 = context3;
            be1Var2 = be1Var3;
            charSequence = charSequence4;
        }
        Bitmap bitmap = (Bitmap) obj;
        CharSequence charSequence5 = charSequence;
        qlb qlbVarB = b(context2, charSequence5, be1Var2, z2, str2);
        a(qlbVarB, charSequence5, bitmap, z2, be1Var2, str2);
        qlbVarB.f(2, false);
        qlbVarB.H = true;
        return qlbVarB.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Context context, be1 be1Var, boolean z, String str, nq4 nq4Var) {
        t92 t92Var;
        Context context2;
        String str2;
        CharSequence charSequence;
        be1 be1Var2;
        boolean z2;
        if (nq4Var instanceof t92) {
            t92Var = (t92) nq4Var;
            int i = t92Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t92Var.k = i - Integer.MIN_VALUE;
            } else {
                t92Var = new t92(this, nq4Var);
            }
        } else {
            t92Var = new t92(this, nq4Var);
        }
        Object obj = t92Var.i;
        int i2 = t92Var.k;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.n("CallsNotification", "showIncomingCallNotification");
            CharSequence charSequence2 = be1Var.d;
            if (charSequence2 == null) {
                charSequence2 = (String) this.f.getValue();
            }
            CharSequence charSequence3 = charSequence2;
            t92Var.d = context;
            t92Var.e = be1Var;
            t92Var.f = str;
            t92Var.g = charSequence3;
            t92Var.h = z;
            t92Var.k = 1;
            Object objG = g(be1Var, true, t92Var);
            Object obj2 = hu4.a;
            if (objG == obj2) {
                return obj2;
            }
            context2 = context;
            str2 = str;
            obj = objG;
            charSequence = charSequence3;
            be1Var2 = be1Var;
            z2 = z;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = t92Var.h;
            CharSequence charSequence4 = t92Var.g;
            str2 = t92Var.f;
            be1 be1Var3 = t92Var.e;
            Context context3 = t92Var.d;
            ch3.d0(obj);
            z2 = z3;
            context2 = context3;
            be1Var2 = be1Var3;
            charSequence = charSequence4;
        }
        Bitmap bitmap = (Bitmap) obj;
        CharSequence charSequence5 = charSequence;
        qlb qlbVarB = b(context2, charSequence5, be1Var2, z2, str2);
        a(qlbVarB, charSequence5, bitmap, z2, be1Var2, str2);
        return qlbVarB.a();
    }
}
