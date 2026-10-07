package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wd3 extends mdh implements xf7 {
    public /* synthetic */ rt2 e;
    public /* synthetic */ ynh f;
    public /* synthetic */ ynh g;
    public /* synthetic */ qfd h;
    public /* synthetic */ boolean i;
    public final /* synthetic */ xd3 j;
    public final /* synthetic */ Context k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd3(xd3 xd3Var, Context context, lq4 lq4Var) {
        super(6, lq4Var);
        this.j = xd3Var;
        this.k = context;
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        wd3 wd3Var = new wd3(this.j, this.k, (lq4) obj6);
        wd3Var.e = (rt2) obj;
        wd3Var.f = (ynh) obj2;
        wd3Var.g = (ynh) obj3;
        wd3Var.h = (qfd) obj4;
        wd3Var.i = zBooleanValue;
        return wd3Var.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01db  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0201  */
    /* JADX WARN: Code duplicated, block: B:121:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0218  */
    /* JADX WARN: Code duplicated, block: B:124:0x021e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0224  */
    /* JADX WARN: Code duplicated, block: B:127:0x0228  */
    /* JADX WARN: Code duplicated, block: B:129:0x0231  */
    /* JADX WARN: Code duplicated, block: B:130:0x023c  */
    /* JADX WARN: Code duplicated, block: B:131:0x023f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0260  */
    /* JADX WARN: Code duplicated, block: B:152:0x0274  */
    /* JADX WARN: Code duplicated, block: B:153:0x0276  */
    /* JADX WARN: Code duplicated, block: B:84:0x017a  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01af  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        hcc hccVarC;
        hcc hccVarC2;
        dcc accVar;
        acc accVar2;
        CharSequence string;
        ynh xnhVar;
        int i;
        boolean z2;
        String strR;
        boolean z3;
        int i2;
        mx2 mx2VarG;
        ybc ybcVar = ybc.a;
        rt2 rt2Var = this.e;
        ynh ynhVar = this.f;
        ynh ynhVar2 = this.g;
        qfd qfdVar = this.h;
        boolean z4 = this.i;
        ch3.d0(obj);
        String name = xd3.class.getName();
        a4c a4cVar = gm0.f;
        CharSequence charSequence = "";
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                String string2 = qfdVar != null ? qfdVar.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                a4cVar.c(je9Var, name, "toolbarParams update " + ((Object) string2), null);
            }
        }
        vg4 vg4VarW = rt2Var.w();
        long jV = vg4VarW != null ? vg4VarW.v() : 0L;
        rt2 rt2Var2 = (rt2) this.j.G1.a.getValue();
        long jA = rt2Var2 != null ? rt2Var2.A() : 0L;
        rt2 rt2Var3 = (rt2) this.j.G1.a.getValue();
        String str = (rt2Var3 == null || (mx2VarG = rt2Var3.G()) == null) ? null : mx2VarG.c;
        vg4 vg4VarW2 = rt2Var.w();
        boolean zD = vg4VarW2 != null ? vg4VarW2.D() : rt2Var.a0();
        boolean zD2 = jcd.d((jcd) this.j.u.getValue(), null, rt2Var, 1);
        boolean zY0 = rt2Var.y0();
        boolean zI = this.j.c.i();
        boolean zA = this.j.c.a();
        boolean z5 = this.j.p1 >= ((long) rt2Var.b.b());
        boolean z6 = (zD || zD2) ? false : true;
        boolean z7 = rt2Var.m0() && z6 && z5;
        if (zI || zA) {
            accVar = ybcVar;
        } else {
            if (!rt2Var.f0()) {
                if (zY0) {
                    accVar2 = new acc(null, new hcc(R.drawable.icon_search, new ub3(this.j, 3)), null);
                } else {
                    boolean z8 = z7 && !(jA == 0 && (str == null || str.length() == 0));
                    boolean z9 = z6;
                    hcc hccVar = new hcc(R.drawable.icon_dots_vertical, new ub3(this.j, 4));
                    if (rt2Var.b0()) {
                        hccVarC = null;
                        z = false;
                    } else if (this.j.K() && jV != 0 && z9) {
                        z = false;
                        hccVarC = xd3.B(this.j, false, jV);
                    } else {
                        z = false;
                        hccVarC = (rt2Var.e0() && z8) ? xd3.C(this.j, false, jA, str) : null;
                    }
                    if (rt2Var.b0()) {
                        hccVarC2 = null;
                    } else if (this.j.K() && jV != 0 && z9) {
                        hccVarC2 = xd3.B(this.j, true, jV);
                    } else if (rt2Var.e0() && z8) {
                        hccVarC2 = xd3.C(this.j, true, jA, str);
                    } else {
                        hccVarC2 = null;
                    }
                    accVar = new acc(hccVarC, hccVar, hccVarC2);
                }
                if (zI) {
                    if (rt2Var.d0()) {
                        i2 = R.string.scheduled_posts_title;
                    } else if (rt2Var.y0()) {
                        i2 = R.string.scheduled_reminders_send_later;
                    } else {
                        i2 = R.string.scheduled_messages_send_later;
                    }
                    string = new tnh(i2).b(this.k);
                    if (string == null) {
                        string = "";
                    }
                } else if (zA) {
                    string = this.k.getString(R.string.chat_screen_comments_title);
                } else {
                    rt2Var.K0();
                    string = rt2Var.j;
                }
                if (!zI || zA) {
                    xnhVar = null;
                } else if (zY0) {
                    xnhVar = new tnh(R.string.chat_screen_toolbar_saved_messages_description);
                } else if (z4) {
                    xnhVar = new tnh(R.string.chat_screen_business_profile);
                } else if (ynhVar2 == null) {
                    xnhVar = ynhVar2;
                } else if (zD2) {
                    xnhVar = new tnh(jcd.b((jcd) this.j.u.getValue(), rt2Var, 2));
                } else if (ynhVar == null) {
                    xnhVar = ynhVar;
                } else if (rt2Var.b0()) {
                    if (rt2Var.D0()) {
                        i = R.string.service_notifications;
                    } else {
                        i = R.string.bot;
                    }
                    xnhVar = new tnh(i);
                } else {
                    xnhVar = new xnh(rt2Var.D(true));
                }
                long jQ = rt2Var.q();
                if (!zY0 || zA) {
                    z2 = z;
                } else {
                    if (rt2Var.u0()) {
                        z3 = true;
                    } else {
                        vg4 vg4VarW3 = rt2Var.w();
                        if (vg4VarW3 != null) {
                            z3 = true;
                            if (vg4VarW3.G()) {
                            }
                        }
                        z2 = z;
                    }
                    z2 = z3;
                }
                if (!zA && !rt2Var.f0()) {
                    rt2Var.L0();
                    charSequence = rt2Var.m;
                }
                CharSequence charSequence2 = charSequence;
                if (zA) {
                    strR = null;
                } else {
                    strR = rt2Var.r(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
                }
                return new yf3(jQ, string, xnhVar, z2, strR, charSequence2, accVar, rt2Var.f0(), z4);
            }
            accVar2 = new acc(null, new hcc(R.drawable.icon_search, new ub3(this.j, 2)), null);
            accVar = accVar2;
        }
        z = false;
        if (zI) {
            if (rt2Var.d0()) {
                i2 = R.string.scheduled_posts_title;
            } else if (rt2Var.y0()) {
                i2 = R.string.scheduled_reminders_send_later;
            } else {
                i2 = R.string.scheduled_messages_send_later;
            }
            string = new tnh(i2).b(this.k);
            if (string == null) {
                string = "";
            }
        } else if (zA) {
            string = this.k.getString(R.string.chat_screen_comments_title);
        } else {
            rt2Var.K0();
            string = rt2Var.j;
        }
        if (!zI) {
            xnhVar = null;
        } else if (zY0) {
            xnhVar = new tnh(R.string.chat_screen_toolbar_saved_messages_description);
        } else if (z4) {
            xnhVar = new tnh(R.string.chat_screen_business_profile);
        } else if (ynhVar2 == null) {
            xnhVar = ynhVar2;
        } else if (zD2) {
            xnhVar = new tnh(jcd.b((jcd) this.j.u.getValue(), rt2Var, 2));
        } else if (ynhVar == null) {
            xnhVar = ynhVar;
        } else if (rt2Var.b0()) {
            if (rt2Var.D0()) {
                i = R.string.service_notifications;
            } else {
                i = R.string.bot;
            }
            xnhVar = new tnh(i);
        } else {
            xnhVar = new xnh(rt2Var.D(true));
        }
        long jQ2 = rt2Var.q();
        if (zY0) {
            z2 = z;
        } else {
            z2 = z;
        }
        if (!zA) {
            rt2Var.L0();
            charSequence = rt2Var.m;
        }
        CharSequence charSequence3 = charSequence;
        if (zA) {
            strR = null;
        } else {
            strR = rt2Var.r(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        }
        return new yf3(jQ2, string, xnhVar, z2, strR, charSequence3, accVar, rt2Var.f0(), z4);
    }
}
