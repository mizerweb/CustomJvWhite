package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ssd {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public ssd(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    public static void a(List list, vg4 vg4Var, ynh ynhVar, String str, boolean z, zmd zmdVar) {
        long jV = vg4Var.v();
        String strK = vg4Var.k();
        if (strK == null) {
            strK = "";
        }
        if (zmdVar == zmd.SETUP_NEW_ADMIN) {
            ynhVar = ynh.b;
        }
        list.add(new sj4(jV, strK, ynhVar, str, z, vg4Var.u(), zmdVar));
    }

    public static void b(List list, xmd xmdVar, boolean z) {
        long j = b6c.e;
        tnh tnhVar = new tnh(R.string.profile_edit_admin_permissions_control_admin_action);
        wmd wmdVar = xmdVar.j;
        boolean z2 = wmdVar.b;
        list.add(new f8(R.id.profile_edit_admin_permissions_control_admin, new ctf(j, 0, tnhVar, null, z2 ? osf.b : osf.e, null, null, new ksf(wmdVar.a, z2), null, false, null, 1896)));
        if (z) {
            list.add(new kaf(new tnh(R.string.profile_edit_admin_permissions_control_admin_section_description), q9i.i, 2));
        }
    }

    public static void c(List list, xmd xmdVar, boolean z) {
        long j = b6c.d;
        tnh tnhVar = new tnh(z ? R.string.profile_edit_channel_new_admin_permissions_change_chat_info_action : R.string.profile_edit_new_admin_permissions_change_chat_info_action);
        tnh tnhVar2 = new tnh(R.string.profile_edit_new_admin_permissions_change_chat_info_description);
        wmd wmdVar = xmdVar.h;
        boolean z2 = wmdVar.b;
        list.add(new f8(R.id.profile_edit_admin_permissions_change_chat_info, new ctf(j, 0, tnhVar, null, z2 ? osf.b : osf.e, tnhVar2, null, new ksf(wmdVar.a, z2), null, false, null, 1864)));
    }

    public static void d(List list, xmd xmdVar, boolean z, boolean z2) {
        wmd wmdVar = xmdVar.i;
        long j = b6c.h;
        tnh tnhVar = new tnh(z ? R.string.profile_edit_channel_admin_permissions_edit_chat_members_action : R.string.profile_edit_admin_permissions_edit_chat_members_action);
        boolean z3 = wmdVar.b;
        osf osfVar = osf.e;
        osf osfVar2 = osf.b;
        list.add(new f8(R.id.profile_edit_admin_permissions_edit_chat_members, new ctf(j, 0, tnhVar, null, z3 ? osfVar2 : osfVar, null, null, new ksf(wmdVar.a, z3), null, false, null, 1896), !z ? 536871936 : 1024));
        if (z) {
            return;
        }
        list.add(new f8(R.id.profile_edit_admin_permissions_edit_chat_link, new ctf(b6c.g, 0, new tnh(R.string.profile_edit_admin_permissions_edit_chat_link_action), null, wmdVar.b ? osfVar2 : osfVar, null, null, new ksf(xmdVar.b, z2), null, false, null, 1896), -2147482624));
    }

    public static void e(List list, boolean z, boolean z2, zmd zmdVar, boolean z3) {
        if (z && zmdVar == zmd.CHANGE_ADMIN) {
            if (z2 && !z3) {
                list.add(new f8(R.id.profile_edit_admin_move_rights, new ctf(b6c.b, 0, new tnh(R.string.oneme_profile_edit_admin_action_give_rights), null, null, null, aql.a(R.drawable.icon_user_defence), fsf.a, null, false, null, 1848), 1024));
            }
            list.add(new ih5(new tnh(R.string.profile_edit_admin_permissions_delete_from_admins)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x016a  */
    /* JADX WARN: Code duplicated, block: B:34:0x016d  */
    /* JADX WARN: Code duplicated, block: B:37:0x01af  */
    /* JADX WARN: Code duplicated, block: B:38:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x0239  */
    /* JADX WARN: Code duplicated, block: B:46:0x023c  */
    /* JADX WARN: Code duplicated, block: B:53:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0305  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Serializable f(vg4 vg4Var, rt2 rt2Var, xmd xmdVar, zmd zmdVar, Long l, nq4 nq4Var) {
        osd osdVar;
        qfd qfdVarB;
        boolean zC;
        String strZ;
        zmd zmdVar2;
        vg4 vg4Var2;
        String str;
        xmd xmdVar2;
        Long l2;
        List list;
        int i;
        List list2;
        xmd xmdVar3;
        ynh ynhVar;
        vg4 vg4Var3;
        zmd zmdVar3;
        List list3;
        List list4;
        rt2 rt2Var2;
        qfd qfdVar;
        boolean zBooleanValue;
        List list5;
        boolean z;
        boolean z2;
        osf osfVar;
        osf osfVar2;
        osf osfVar3;
        boolean z3;
        osf osfVar4;
        boolean z4;
        osf osfVar5;
        boolean z5;
        osf osfVar6;
        gjf gjfVar;
        boolean z6;
        boolean z7;
        boolean z8;
        osf osfVar7;
        rt2 rt2Var3 = rt2Var;
        if (nq4Var instanceof osd) {
            osdVar = (osd) nq4Var;
            int i2 = osdVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                osdVar.r = i2 - Integer.MIN_VALUE;
            } else {
                osdVar = new osd(this, nq4Var);
            }
        } else {
            osdVar = new osd(this, nq4Var);
        }
        Object obj = osdVar.p;
        int i3 = osdVar.r;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(obj);
            c79 c79VarW = yab.w();
            qfdVarB = ((yfd) this.a.getValue()).B(vg4Var.v());
            ny8 ny8Var = this.d;
            zC = ((jcd) ny8Var.getValue()).c(rt2Var3, vg4Var);
            if (zC) {
                strZ = ((jcd) ny8Var.getValue()).a().toString();
            } else {
                strZ = vg4Var.z(us0.c);
                if (strZ == null) {
                    strZ = "";
                }
            }
            osdVar.d = vg4Var;
            osdVar.e = rt2Var3;
            osdVar.f = xmdVar;
            zmdVar2 = zmdVar;
            osdVar.g = zmdVar2;
            osdVar.h = l;
            osdVar.i = c79VarW;
            osdVar.j = c79VarW;
            osdVar.k = qfdVarB;
            osdVar.l = strZ;
            osdVar.n = 0;
            osdVar.o = zC;
            osdVar.r = 1;
            Object objJ = j(l, vg4Var, rt2Var3, osdVar);
            if (objJ != hu4Var) {
                vg4Var2 = vg4Var;
                str = strZ;
                xmdVar2 = xmdVar;
                l2 = l;
                list = c79VarW;
                i = 0;
                obj = objJ;
                list2 = list;
            }
            return hu4Var;
        }
        if (i3 == 1) {
            boolean z9 = osdVar.o;
            int i4 = osdVar.n;
            String str2 = (String) osdVar.l;
            qfdVarB = osdVar.k;
            List list6 = osdVar.j;
            List list7 = osdVar.i;
            l2 = osdVar.h;
            zmd zmdVar4 = osdVar.g;
            xmdVar2 = osdVar.f;
            rt2 rt2Var4 = osdVar.e;
            vg4Var2 = osdVar.d;
            ch3.d0(obj);
            zC = z9;
            str = str2;
            i = i4;
            rt2Var3 = rt2Var4;
            list2 = list6;
            zmdVar2 = zmdVar4;
            list = list7;
        } else {
            if (i3 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = osdVar.m;
            ynh ynhVar2 = (ynh) osdVar.l;
            qfdVar = osdVar.k;
            List list8 = osdVar.j;
            list4 = osdVar.i;
            zmd zmdVar5 = osdVar.g;
            xmdVar3 = osdVar.f;
            rt2Var2 = osdVar.e;
            vg4 vg4Var4 = osdVar.d;
            ch3.d0(obj);
            ynhVar = ynhVar2;
            vg4Var3 = vg4Var4;
            list3 = list8;
            zmdVar3 = zmdVar5;
        }
        String str3 = str;
        zBooleanValue = ((Boolean) obj).booleanValue();
        a(list3, vg4Var3, ynhVar, str3, qfdVar.b(), zmdVar3);
        list5 = list3;
        vg4 vg4Var5 = vg4Var3;
        zmd zmdVar6 = zmdVar3;
        z = vg4Var5.f;
        c(list5, xmdVar3, true);
        long j = b6c.l;
        tnh tnhVar = new tnh(R.string.profile_edit_channel_admin_permissions_send_messages_action);
        wmd wmdVar = xmdVar3.c;
        z2 = wmdVar.b;
        osfVar = osf.e;
        osfVar2 = osf.b;
        if (z2) {
            osfVar3 = osfVar2;
        } else {
            osfVar3 = osfVar;
        }
        list5.add(new f8(R.id.profile_edit_admin_permissions_send_messages, new ctf(j, 0, tnhVar, null, osfVar3, null, null, new ksf(wmdVar.a, z2), null, false, null, 1896), 536871936));
        long j2 = b6c.i;
        tnh tnhVar2 = new tnh(R.string.profile_edit_channel_admin_permissions_only_edit_messages_action);
        wmd wmdVar2 = xmdVar3.d;
        z3 = wmdVar2.b;
        if (z3) {
            osfVar4 = osfVar2;
        } else {
            osfVar4 = osfVar;
        }
        list5.add(new f8(R.id.profile_edit_admin_permissions_edit_messages, new ctf(j2, 0, tnhVar2, null, osfVar4, null, null, new ksf(wmdVar2.a, z3), null, false, null, 1896), 1073742848));
        long j3 = b6c.f;
        tnh tnhVar3 = new tnh(R.string.profile_edit_channel_admin_permissions_delete_messages_action);
        wmd wmdVar3 = xmdVar3.f;
        z4 = wmdVar3.b;
        if (z4) {
            osfVar5 = osfVar2;
        } else {
            osfVar5 = osfVar;
        }
        list5.add(new f8(R.id.profile_edit_admin_permissions_delete_messages, new ctf(j3, 0, tnhVar3, null, osfVar5, null, null, new ksf(wmdVar3.a, z4), null, false, null, 1896), 1073742848));
        long j4 = b6c.j;
        tnh tnhVar4 = new tnh(R.string.profile_edit_channel_admin_permissions_pin_messages_action);
        wmd wmdVar4 = xmdVar3.g;
        z5 = wmdVar4.b;
        if (z5) {
            osfVar6 = osfVar2;
        } else {
            osfVar6 = osfVar;
        }
        list5.add(new f8(R.id.profile_edit_admin_permissions_pin_messages, new ctf(j4, 0, tnhVar4, null, osfVar6, null, null, new ksf(wmdVar4.a, z5), null, false, null, 1896), -2147482624));
        d(list5, xmdVar3, true, false);
        boolean zE = vg4Var5.E();
        gjfVar = (gjf) this.f.getValue();
        gjfVar.getClass();
        if (((Number) ((g5d) gjfVar).a.E2.a(e5d.S6[186]).i()).longValue() != 0 && !zE) {
            long j5 = b6c.m;
            tnh tnhVar5 = new tnh(R.string.profile_edit_admin_permissions_view_stats);
            wmd wmdVar5 = xmdVar3.k;
            z8 = wmdVar5.b;
            if (z8) {
                osfVar7 = osfVar2;
            } else {
                osfVar7 = osfVar;
            }
            list5.add(new f8(R.id.profile_edit_admin_view_stats, new ctf(j5, 0, tnhVar5, null, osfVar7, null, null, new ksf(wmdVar5.a, z8), null, false, null, 1896), 1024));
        }
        if (!z || rt2Var2.v0(vg4Var5.v())) {
            z6 = false;
        } else {
            z6 = true;
        }
        b(list5, xmdVar3, z6);
        if (zBooleanValue || z || rt2Var2.v0(vg4Var5.v())) {
            z7 = false;
        } else {
            z7 = true;
        }
        e(list5, z7, rt2Var2.B0(), zmdVar6, vg4Var5.E());
        return yab.j(list4);
        ynh ynhVar3 = (ynh) obj;
        boolean zH = rt2Var3.H();
        osdVar.d = vg4Var2;
        osdVar.e = rt2Var3;
        osdVar.f = xmdVar2;
        osdVar.g = zmdVar2;
        xmd xmdVar4 = xmdVar2;
        osdVar.h = null;
        osdVar.i = list;
        osdVar.j = list2;
        osdVar.k = qfdVarB;
        osdVar.l = ynhVar3;
        osdVar.m = str;
        osdVar.n = i;
        osdVar.o = zC;
        osdVar.r = 2;
        Object objH = h(l2, zH, rt2Var3);
        if (objH != hu4Var) {
            xmdVar3 = xmdVar4;
            ynhVar = ynhVar3;
            vg4Var3 = vg4Var2;
            zmdVar3 = zmdVar2;
            list3 = list2;
            list4 = list;
            rt2Var2 = rt2Var3;
            obj = objH;
            qfdVar = qfdVarB;
            String str4 = str;
            zBooleanValue = ((Boolean) obj).booleanValue();
            a(list3, vg4Var3, ynhVar, str4, qfdVar.b(), zmdVar3);
            list5 = list3;
            vg4 vg4Var6 = vg4Var3;
            zmd zmdVar7 = zmdVar3;
            z = vg4Var6.f;
            c(list5, xmdVar3, true);
            long j6 = b6c.l;
            tnh tnhVar6 = new tnh(R.string.profile_edit_channel_admin_permissions_send_messages_action);
            wmd wmdVar6 = xmdVar3.c;
            z2 = wmdVar6.b;
            osfVar = osf.e;
            osfVar2 = osf.b;
            if (z2) {
                osfVar3 = osfVar2;
            } else {
                osfVar3 = osfVar;
            }
            list5.add(new f8(R.id.profile_edit_admin_permissions_send_messages, new ctf(j6, 0, tnhVar6, null, osfVar3, null, null, new ksf(wmdVar6.a, z2), null, false, null, 1896), 536871936));
            long j7 = b6c.i;
            tnh tnhVar7 = new tnh(R.string.profile_edit_channel_admin_permissions_only_edit_messages_action);
            wmd wmdVar7 = xmdVar3.d;
            z3 = wmdVar7.b;
            if (z3) {
                osfVar4 = osfVar2;
            } else {
                osfVar4 = osfVar;
            }
            list5.add(new f8(R.id.profile_edit_admin_permissions_edit_messages, new ctf(j7, 0, tnhVar7, null, osfVar4, null, null, new ksf(wmdVar7.a, z3), null, false, null, 1896), 1073742848));
            long j8 = b6c.f;
            tnh tnhVar8 = new tnh(R.string.profile_edit_channel_admin_permissions_delete_messages_action);
            wmd wmdVar8 = xmdVar3.f;
            z4 = wmdVar8.b;
            if (z4) {
                osfVar5 = osfVar2;
            } else {
                osfVar5 = osfVar;
            }
            list5.add(new f8(R.id.profile_edit_admin_permissions_delete_messages, new ctf(j8, 0, tnhVar8, null, osfVar5, null, null, new ksf(wmdVar8.a, z4), null, false, null, 1896), 1073742848));
            long j9 = b6c.j;
            tnh tnhVar9 = new tnh(R.string.profile_edit_channel_admin_permissions_pin_messages_action);
            wmd wmdVar9 = xmdVar3.g;
            z5 = wmdVar9.b;
            if (z5) {
                osfVar6 = osfVar2;
            } else {
                osfVar6 = osfVar;
            }
            list5.add(new f8(R.id.profile_edit_admin_permissions_pin_messages, new ctf(j9, 0, tnhVar9, null, osfVar6, null, null, new ksf(wmdVar9.a, z5), null, false, null, 1896), -2147482624));
            d(list5, xmdVar3, true, false);
            boolean zE2 = vg4Var6.E();
            gjfVar = (gjf) this.f.getValue();
            gjfVar.getClass();
            if (((Number) ((g5d) gjfVar).a.E2.a(e5d.S6[186]).i()).longValue() != 0) {
                long j10 = b6c.m;
                tnh tnhVar10 = new tnh(R.string.profile_edit_admin_permissions_view_stats);
                wmd wmdVar10 = xmdVar3.k;
                z8 = wmdVar10.b;
                if (z8) {
                    osfVar7 = osfVar2;
                } else {
                    osfVar7 = osfVar;
                }
                list5.add(new f8(R.id.profile_edit_admin_view_stats, new ctf(j10, 0, tnhVar10, null, osfVar7, null, null, new ksf(wmdVar10.a, z8), null, false, null, 1896), 1024));
            }
            if (z) {
                z6 = false;
            } else {
                z6 = false;
            }
            b(list5, xmdVar3, z6);
            if (zBooleanValue) {
                z7 = false;
            } else {
                z7 = false;
            }
            e(list5, z7, rt2Var2.B0(), zmdVar7, vg4Var6.E());
            return yab.j(list4);
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0138  */
    /* JADX WARN: Code duplicated, block: B:38:0x015e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0172  */
    /* JADX WARN: Code duplicated, block: B:42:0x0177  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x020b  */
    /* JADX WARN: Code duplicated, block: B:56:0x020e  */
    /* JADX WARN: Code duplicated, block: B:62:0x024e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0262  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Serializable g(vg4 vg4Var, rt2 rt2Var, xmd xmdVar, zmd zmdVar, Long l, nq4 nq4Var) {
        psd psdVar;
        qfd qfdVarB;
        String strZ;
        zmd zmdVar2;
        vg4 vg4Var2;
        boolean z;
        xmd xmdVar2;
        List list;
        Object obj;
        Long l2;
        String str;
        int i;
        List list2;
        rt2 rt2Var2;
        String str2;
        qfd qfdVar;
        List list3;
        vg4 vg4Var3;
        zmd zmdVar3;
        ynh ynhVar;
        List list4;
        boolean zBooleanValue;
        boolean z2;
        boolean z3;
        boolean zE;
        osf osfVar;
        osf osfVar2;
        boolean z4;
        osf osfVar3;
        int i2;
        boolean z5;
        osf osfVar4;
        boolean z6;
        boolean z7;
        boolean z8;
        osf osfVar5;
        rt2 rt2Var3 = rt2Var;
        if (nq4Var instanceof psd) {
            psdVar = (psd) nq4Var;
            int i3 = psdVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                psdVar.r = i3 - Integer.MIN_VALUE;
            } else {
                psdVar = new psd(this, nq4Var);
            }
        } else {
            psdVar = new psd(this, nq4Var);
        }
        Object objH = psdVar.p;
        int i4 = psdVar.r;
        hu4 hu4Var = hu4.a;
        if (i4 == 0) {
            ch3.d0(objH);
            c79 c79VarW = yab.w();
            qfdVarB = ((yfd) this.a.getValue()).B(vg4Var.v());
            ny8 ny8Var = this.d;
            boolean zC = ((jcd) ny8Var.getValue()).c(rt2Var3, vg4Var);
            if (zC) {
                strZ = ((jcd) ny8Var.getValue()).a().toString();
            } else {
                strZ = vg4Var.z(us0.c);
                if (strZ == null) {
                    strZ = "";
                }
            }
            psdVar.d = vg4Var;
            psdVar.e = rt2Var3;
            psdVar.f = xmdVar;
            zmdVar2 = zmdVar;
            psdVar.g = zmdVar2;
            psdVar.h = l;
            psdVar.i = c79VarW;
            psdVar.j = c79VarW;
            psdVar.k = qfdVarB;
            psdVar.l = strZ;
            psdVar.n = 0;
            psdVar.o = zC;
            psdVar.r = 1;
            Object objJ = j(l, vg4Var, rt2Var3, psdVar);
            if (objJ != hu4Var) {
                vg4Var2 = vg4Var;
                z = zC;
                xmdVar2 = xmdVar;
                list = c79VarW;
                obj = objJ;
                l2 = l;
                str = strZ;
                i = 0;
                list2 = list;
            }
            return hu4Var;
        }
        if (i4 == 1) {
            z = psdVar.o;
            int i5 = psdVar.n;
            str = (String) psdVar.l;
            qfdVarB = psdVar.k;
            List list5 = psdVar.j;
            List list6 = psdVar.i;
            l2 = psdVar.h;
            zmd zmdVar4 = psdVar.g;
            xmdVar2 = psdVar.f;
            rt2 rt2Var4 = psdVar.e;
            vg4Var2 = psdVar.d;
            ch3.d0(objH);
            i = i5;
            rt2Var3 = rt2Var4;
            list2 = list5;
            zmdVar2 = zmdVar4;
            obj = objH;
            list = list6;
        } else {
            if (i4 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = psdVar.m;
            ynhVar = (ynh) psdVar.l;
            qfdVar = psdVar.k;
            list3 = psdVar.j;
            list4 = psdVar.i;
            zmdVar3 = psdVar.g;
            xmdVar2 = psdVar.f;
            rt2Var2 = psdVar.e;
            vg4Var3 = psdVar.d;
            ch3.d0(objH);
        }
        zBooleanValue = ((Boolean) objH).booleanValue();
        if (zBooleanValue || !xmdVar2.i.a) {
            z2 = false;
        } else {
            z2 = true;
        }
        List list7 = list3;
        vg4 vg4Var4 = vg4Var3;
        zmd zmdVar5 = zmdVar3;
        a(list7, vg4Var4, ynhVar, str2, qfdVar.b(), zmdVar5);
        z3 = vg4Var3.f;
        c(list3, xmdVar2, false);
        zE = vg4Var3.E();
        osfVar = osf.e;
        osfVar2 = osf.b;
        if (zE) {
            long j = b6c.k;
            tnh tnhVar = new tnh(R.string.profile_edit_admin_permissions_read_messages_action);
            wmd wmdVar = xmdVar2.e;
            z8 = wmdVar.b;
            if (z8) {
                osfVar5 = osfVar2;
            } else {
                osfVar5 = osfVar;
            }
            list3.add(new f8(R.id.profile_edit_admin_permissions_read_messages, new ctf(j, 0, tnhVar, null, osfVar5, null, null, new ksf(wmdVar.a, z8), null, false, null, 1896), 536871936));
        }
        long j2 = b6c.f;
        tnh tnhVar2 = new tnh(R.string.profile_edit_admin_permissions_edit_messages_action);
        wmd wmdVar2 = xmdVar2.f;
        z4 = wmdVar2.b;
        if (z4) {
            osfVar3 = osfVar2;
        } else {
            osfVar3 = osfVar;
        }
        ctf ctfVar = new ctf(j2, 0, tnhVar2, null, osfVar3, null, null, new ksf(wmdVar2.a, z4), null, false, null, 1896);
        if (zE) {
            i2 = 1073742848;
        } else {
            i2 = 536871936;
        }
        list3.add(new f8(R.id.profile_edit_admin_permissions_delete_messages, ctfVar, i2));
        long j3 = b6c.j;
        tnh tnhVar3 = new tnh(R.string.profile_edit_admin_permissions_pin_messages_action);
        wmd wmdVar3 = xmdVar2.g;
        z5 = wmdVar3.b;
        if (z5) {
            osfVar4 = osfVar2;
        } else {
            osfVar4 = osfVar;
        }
        list3.add(new f8(R.id.profile_edit_admin_permissions_pin_messages, new ctf(j3, 0, tnhVar3, null, osfVar4, null, null, new ksf(wmdVar3.a, z5), null, false, null, 1896), -2147482624));
        d(list3, xmdVar2, false, z2);
        if (z3 == 0 || rt2Var2.v0(vg4Var3.v())) {
            z6 = false;
        } else {
            z6 = true;
        }
        b(list3, xmdVar2, z6);
        if (zBooleanValue || z3 || rt2Var2.v0(vg4Var3.v())) {
            z7 = false;
        } else {
            z7 = true;
        }
        e(list3, z7, rt2Var2.B0(), zmdVar5, vg4Var3.E());
        return yab.j(list4);
        ynh ynhVar2 = (ynh) obj;
        boolean zH = rt2Var3.H();
        psdVar.d = vg4Var2;
        psdVar.e = rt2Var3;
        psdVar.f = xmdVar2;
        psdVar.g = zmdVar2;
        psdVar.h = null;
        psdVar.i = list;
        psdVar.j = list2;
        psdVar.k = qfdVarB;
        psdVar.l = ynhVar2;
        psdVar.m = str;
        psdVar.n = i;
        psdVar.o = z;
        psdVar.r = 2;
        objH = h(l2, zH, rt2Var3);
        if (objH != hu4Var) {
            rt2Var2 = rt2Var3;
            str2 = str;
            qfdVar = qfdVarB;
            list3 = list2;
            vg4Var3 = vg4Var2;
            zmdVar3 = zmdVar2;
            ynhVar = ynhVar2;
            list4 = list;
            zBooleanValue = ((Boolean) objH).booleanValue();
            if (zBooleanValue) {
                z2 = false;
            } else {
                z2 = false;
            }
            List list8 = list3;
            vg4 vg4Var5 = vg4Var3;
            zmd zmdVar6 = zmdVar3;
            a(list8, vg4Var5, ynhVar, str2, qfdVar.b(), zmdVar6);
            z3 = vg4Var3.f;
            c(list3, xmdVar2, false);
            zE = vg4Var3.E();
            osfVar = osf.e;
            osfVar2 = osf.b;
            if (zE) {
                long j4 = b6c.k;
                tnh tnhVar4 = new tnh(R.string.profile_edit_admin_permissions_read_messages_action);
                wmd wmdVar4 = xmdVar2.e;
                z8 = wmdVar4.b;
                if (z8) {
                    osfVar5 = osfVar2;
                } else {
                    osfVar5 = osfVar;
                }
                list3.add(new f8(R.id.profile_edit_admin_permissions_read_messages, new ctf(j4, 0, tnhVar4, null, osfVar5, null, null, new ksf(wmdVar4.a, z8), null, false, null, 1896), 536871936));
            }
            long j5 = b6c.f;
            tnh tnhVar5 = new tnh(R.string.profile_edit_admin_permissions_edit_messages_action);
            wmd wmdVar5 = xmdVar2.f;
            z4 = wmdVar5.b;
            if (z4) {
                osfVar3 = osfVar2;
            } else {
                osfVar3 = osfVar;
            }
            ctf ctfVar2 = new ctf(j5, 0, tnhVar5, null, osfVar3, null, null, new ksf(wmdVar5.a, z4), null, false, null, 1896);
            if (zE) {
                i2 = 1073742848;
            } else {
                i2 = 536871936;
            }
            list3.add(new f8(R.id.profile_edit_admin_permissions_delete_messages, ctfVar2, i2));
            long j6 = b6c.j;
            tnh tnhVar6 = new tnh(R.string.profile_edit_admin_permissions_pin_messages_action);
            wmd wmdVar6 = xmdVar2.g;
            z5 = wmdVar6.b;
            if (z5) {
                osfVar4 = osfVar2;
            } else {
                osfVar4 = osfVar;
            }
            list3.add(new f8(R.id.profile_edit_admin_permissions_pin_messages, new ctf(j6, 0, tnhVar6, null, osfVar4, null, null, new ksf(wmdVar6.a, z5), null, false, null, 1896), -2147482624));
            d(list3, xmdVar2, false, z2);
            if (z3 == 0) {
                z6 = false;
            } else {
                z6 = false;
            }
            b(list3, xmdVar2, z6);
            if (zBooleanValue) {
                z7 = false;
            } else {
                z7 = false;
            }
            e(list3, z7, rt2Var2.B0(), zmdVar6, vg4Var3.E());
            return yab.j(list4);
        }
        return hu4Var;
    }

    public final Boolean h(Long l, boolean z, rt2 rt2Var) {
        return Boolean.valueOf((l != null && l.longValue() == ((s7f) ((et3) this.e.getValue())).t() && z) || rt2Var.B0());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Long l, nq4 nq4Var) {
        qsd qsdVar;
        String strK;
        if (nq4Var instanceof qsd) {
            qsdVar = (qsd) nq4Var;
            int i = qsdVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsdVar.f = i - Integer.MIN_VALUE;
            } else {
                qsdVar = new qsd(this, nq4Var);
            }
        } else {
            qsdVar = new qsd(this, nq4Var);
        }
        Object objI = qsdVar.d;
        int i2 = qsdVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue == ((s7f) ((et3) this.e.getValue())).t()) {
                    return new tnh(R.string.profile_edit_admin_permissions_info_section_you_add_description);
                }
                no4 no4Var = (no4) this.c.getValue();
                qsdVar.f = 1;
                objI = no4Var.i(jLongValue);
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objI);
        vg4 vg4Var = (vg4) objI;
        if (vg4Var != null && (strK = vg4Var.k()) != null) {
            return new vnh(R.string.profile_edit_admin_permissions_info_section_smb_add_description, a.n1(new Object[]{strK}));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Long l, vg4 vg4Var, rt2 rt2Var, nq4 nq4Var) {
        rsd rsdVar;
        if (nq4Var instanceof rsd) {
            rsdVar = (rsd) nq4Var;
            int i = rsdVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                rsdVar.h = i - Integer.MIN_VALUE;
            } else {
                rsdVar = new rsd(this, nq4Var);
            }
        } else {
            rsdVar = new rsd(this, nq4Var);
        }
        Object objI = rsdVar.f;
        int i2 = rsdVar.h;
        if (i2 == 0) {
            ch3.d0(objI);
            rsdVar.d = vg4Var;
            rsdVar.e = rt2Var;
            rsdVar.h = 1;
            objI = i(l, rsdVar);
            Object obj = hu4.a;
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var = rsdVar.e;
            vg4Var = rsdVar.d;
            ch3.d0(objI);
        }
        ynh ynhVar = (ynh) objI;
        if (vg4Var.f) {
            return new tnh(R.string.profile_edit_admin_permissions_info_section_you_description);
        }
        if (rt2Var.v0(vg4Var.v())) {
            return new tnh(R.string.profile_edit_admin_permissions_info_section_owner_description);
        }
        return ynhVar == null ? new xnh(((yfd) this.b.getValue()).y(vg4Var)) : ynhVar;
    }
}
