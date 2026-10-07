package defpackage;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pjb {
    public final zed a;
    public final t51 b;
    public final ny8 c;
    public final ny8 d;

    public pjb(zed zedVar, t51 t51Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = zedVar;
        this.b = t51Var;
        this.c = ny8Var;
        this.d = ny8Var2;
    }

    public static void b(pjb pjbVar, ia4 ia4Var, boolean z, int i) {
        int i2;
        boolean z2 = (i & 2) != 0;
        if ((i & 4) != 0) {
            z = false;
        }
        pjbVar.getClass();
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "NotifConfigLogic", qv1.k("onConfiguration: step 1: hash=", ia4Var.a), null);
        }
        String str = ia4Var.a;
        if (str != null) {
            e5d e5dVar = pjbVar.a.b;
            SharedPreferences.Editor editorEdit = e5dVar.q().edit();
            if (str.length() == 0) {
                editorEdit.remove("hash");
            } else {
                editorEdit.putString("hash", str);
            }
            editorEdit.commit();
            e5dVar.M.a(e5d.S6[31]).k();
        }
        v56 v56Var = ia4Var.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "NotifConfigLogic", "onConfiguration: step 2: serverSettings=" + v56Var, null);
        }
        if (v56Var != null) {
            e5d e5dVar2 = pjbVar.a.b;
            e5dVar2.e((Map) v56Var.b, e5dVar2.q().edit(), 4);
            e5dVar2.b.a(nhb.k);
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, "NotifConfigLogic", zo5.q("onConfiguration: step 3: check invalidation config, onLogin:", ", firstLogin:", z2, z), null);
        }
        je9 je9Var2 = je9.e;
        if (z2 && v56Var != null) {
            ojb ojbVar = new ojb((JSONObject) pjbVar.a.b.f4.a(e5d.S6[267]).i());
            boolean z3 = ojbVar.a && (i2 = ojbVar.b) != -1 && pjbVar.a.a.h() < i2;
            if (z && z3) {
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, "NotifConfigLogic", "On first login we only save ver invalidate db, curVer:" + pjbVar.a.a.h() + ", config:" + ojbVar, null);
                }
                pjbVar.a.a.y(ojbVar.b);
                pjbVar.a.a.z(0);
            } else if (z3) {
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                    a4cVar5.c(je9Var2, "NotifConfigLogic", "Make invalidate db on next start, curVer:" + pjbVar.a.a.h() + ", config:" + ojbVar, null);
                }
                pjbVar.a.a.E(true);
                pjbVar.a.a.y(ojbVar.b);
                pjbVar.a.a.z(ojbVar.c);
            }
            if (!ojbVar.a) {
                a4c a4cVar6 = gm0.f;
                if (a4cVar6 != null && a4cVar6.b(je9Var2)) {
                    a4cVar6.c(je9Var2, "NotifConfigLogic", "Clear invalidate db ver because disabled", null);
                }
                pjbVar.a.a.y(-1);
                pjbVar.a.a.z(0);
                pjbVar.a.a.E(false);
            }
        }
        a4c a4cVar7 = gm0.f;
        if (a4cVar7 != null && a4cVar7.b(je9Var)) {
            a4cVar7.c(je9Var, "NotifConfigLogic", "onConfiguration: step 4: user settings=" + ia4Var.d, null);
        }
        lni lniVar = ia4Var.d;
        if (lniVar != null) {
            pjbVar.a.c.q(lniVar);
            lni lniVar2 = ia4Var.d;
            if (lniVar2 != null ? cqk.d(lniVar2.w, Boolean.FALSE) : false) {
                xb9 xb9Var = pjbVar.a.a;
                xb9Var.e("app.pin_" + xb9Var.t(), null);
            }
            ((da4) pjbVar.d.getValue()).a();
        }
        a4c a4cVar8 = gm0.f;
        if (a4cVar8 != null && a4cVar8.b(je9Var)) {
            a4cVar8.c(je9Var, "NotifConfigLogic", "onConfiguration: step 5: experiments=" + ia4Var.e, null);
        }
        Map map = ia4Var.e;
        if (map != null) {
            e5d e5dVar3 = pjbVar.a.b;
            e5dVar3.e(map, ((SharedPreferences) e5dVar3.f.getValue()).edit().clear(), 3);
            e5dVar3.b.a(zpe.l);
        }
        if (z2) {
            gm0.n("NotifConfigLogic", "onConfiguration: post config event");
            pjbVar.b.c(new aa4());
            return;
        }
        a4c a4cVar9 = gm0.f;
        if (a4cVar9 != null && a4cVar9.b(je9Var)) {
            a4cVar9.c(je9Var, "NotifConfigLogic", "onConfiguration: step 6: chats settings=".concat(ia4Var.a()), null);
        }
        pjbVar.a(ia4Var, ui9.a);
    }

    public final void a(ia4 ia4Var, m8b m8bVar) {
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        gm0.n("NotifConfigLogic", "changeChatSettings");
        l8b l8bVar = ia4Var.c;
        if (l8bVar == null) {
            return;
        }
        int i3 = 0;
        pw pwVar = new pw(0);
        long[] jArr3 = l8bVar.b;
        Object[] objArr = l8bVar.c;
        long[] jArr4 = l8bVar.a;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr4[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = i3;
                    while (i7 < i6) {
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i = i5;
                            i2 = i7;
                            long j2 = jArr3[i8];
                            ge3 ge3Var = (ge3) objArr[i8];
                            ny8 ny8Var = this.c;
                            rt2 rt2VarK = ((qw2) ny8Var.getValue()).K(j2);
                            if (rt2VarK == null) {
                                qw2 qw2Var = (qw2) ny8Var.getValue();
                                qw2Var.getClass();
                                tw2 tw2Var = new tw2();
                                tw2Var.b = lx2.b;
                                tw2Var.a = j2;
                                tw2Var.l = j2;
                                tw2Var.c = kx2.d;
                                tw2Var.w0 = 2;
                                long jH = ((n25) qw2Var.n.get()).a().h(new nx2(tw2Var));
                                qw2Var.Y(jH, qw2Var.a0(jH));
                                rt2VarK = qw2Var.e0(jH, false);
                            }
                            long j3 = rt2VarK.a;
                            if (m8bVar.d(j3)) {
                                i3 = 0;
                            } else {
                                qw2 qw2Var2 = (qw2) ny8Var.getValue();
                                qw2Var2.getClass();
                                gm0.m("qw2", "changeChatConfiguration, chatId = %d, chatSettings = %s", Long.valueOf(j3), ge3Var);
                                i3 = 0;
                                qw2Var2.v(j3, false, new ot4(27, ge3Var));
                                pwVar.add(Long.valueOf(j3));
                            }
                        } else {
                            jArr4 = jArr4;
                            i = i5;
                            i2 = i7;
                        }
                        j >>= i;
                        i7 = i2 + 1;
                        i5 = i;
                        jArr4 = jArr4;
                        jArr3 = jArr3;
                    }
                    jArr = jArr4;
                    jArr2 = jArr3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    jArr2 = jArr3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr4 = jArr;
                jArr3 = jArr2;
            }
        }
        if (pwVar.isEmpty()) {
            return;
        }
        this.b.c(new wo3((Collection) pwVar, true, false, (mg5) null, (cid) null, (Set) null, 124));
    }
}
