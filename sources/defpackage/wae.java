package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class wae {
    public static final /* synthetic */ int g = 0;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public wae(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(wae waeVar, ArrayList arrayList, nq4 nq4Var) {
        nae naeVar;
        Iterator it;
        waeVar.getClass();
        if (nq4Var instanceof nae) {
            naeVar = (nae) nq4Var;
            int i = naeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                naeVar.g = i - Integer.MIN_VALUE;
            } else {
                naeVar = new nae(waeVar, nq4Var);
            }
        } else {
            naeVar = new nae(waeVar, nq4Var);
        }
        Object obj = naeVar.e;
        int i2 = naeVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            it = arrayList.iterator();
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = naeVar.d;
            ch3.d0(obj);
        }
        while (it.hasNext()) {
            eae eaeVar = (eae) it.next();
            aae aaeVarG = waeVar.g();
            naeVar.d = it;
            naeVar.g = 1;
            Object objC = waeVar.c(aaeVarG, eaeVar, naeVar);
            Object obj2 = hu4.a;
            if (objC == obj2) {
                return obj2;
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(wae waeVar, List list, nq4 nq4Var) {
        tae taeVar;
        Long lValueOf;
        o60 o60Var;
        if (nq4Var instanceof tae) {
            taeVar = (tae) nq4Var;
            int i = taeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                taeVar.g = i - Integer.MIN_VALUE;
            } else {
                taeVar = new tae(waeVar, nq4Var);
            }
        } else {
            taeVar = new tae(waeVar, nq4Var);
        }
        Object obj = taeVar.e;
        int i2 = taeVar.g;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            if (!list.isEmpty()) {
                taeVar.d = list;
                taeVar.g = 1;
                Object objJ = waeVar.j(list, taeVar);
                Object obj2 = hu4.a;
                if (objJ == obj2) {
                    return obj2;
                }
            }
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = (List) taeVar.d;
        ch3.d0(obj);
        ArrayList arrayList = new ArrayList();
        for (eae eaeVar : list) {
            int iOrdinal = eaeVar.a.ordinal();
            if (iOrdinal == 2) {
                cmg cmgVar = eaeVar instanceof cmg ? (cmg) eaeVar : null;
                if (cmgVar != null) {
                    lValueOf = Long.valueOf(cmgVar.c);
                } else {
                    lValueOf = null;
                }
            } else if (iOrdinal == 3) {
                qm7 qm7Var = eaeVar instanceof qm7 ? (qm7) eaeVar : null;
                if (qm7Var == null || (o60Var = qm7Var.c) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(o60Var.i);
                }
            } else {
                lValueOf = null;
            }
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        if (!arrayList.isEmpty()) {
            ((pvb) waeVar.d.getValue()).c(6, p90.i(arrayList));
        }
        return sbiVar;
    }

    public static Object l(aae aaeVar, eae eaeVar, nq4 nq4Var) {
        final long j = eaeVar.b;
        final mae maeVar = eaeVar.a;
        final int i = 0;
        final int i2 = 1;
        if (j > 0) {
            return ch3.I(nq4Var, aaeVar.a, true, false, new cf7() { // from class: z9e
                @Override // defpackage.cf7
                public final Object invoke(Object obj) throws Exception {
                    bae baeVar;
                    s8 s8Var;
                    ye6 ye6Var;
                    gj2 gj2Var;
                    bae baeVar2;
                    s8 s8Var2;
                    ye6 ye6Var2;
                    gj2 gj2Var2;
                    bae baeVar3;
                    s8 s8Var3;
                    ye6 ye6Var3;
                    gj2 gj2Var3;
                    int i3 = i2;
                    long j2 = j;
                    mae maeVar2 = maeVar;
                    switch (i3) {
                        case 0:
                            vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND sticker_id=?");
                            try {
                                vxeVarO0.c(1, maeVar2.a);
                                vxeVarO0.c(2, j2);
                                int iE = qyj.E(vxeVarO0, "id");
                                int iE2 = qyj.E(vxeVarO0, "recent_type");
                                int iE3 = qyj.E(vxeVarO0, "recent_time");
                                int iE4 = qyj.E(vxeVarO0, "server_id");
                                int iE5 = qyj.E(vxeVarO0, "sticker_id");
                                int iE6 = qyj.E(vxeVarO0, "emoji");
                                int iE7 = qyj.E(vxeVarO0, "gif");
                                int iE8 = qyj.E(vxeVarO0, "gif_id");
                                if (vxeVarO0.M0()) {
                                    if (vxeVarO0.isNull(iE5)) {
                                        s8Var = null;
                                    } else {
                                        s8Var = new s8();
                                        s8Var.a = vxeVarO0.getLong(iE5);
                                    }
                                    if (vxeVarO0.isNull(iE6)) {
                                        ye6Var = null;
                                    } else {
                                        ye6Var = new ye6();
                                        ye6Var.a = vxeVarO0.B0(iE6);
                                    }
                                    if (vxeVarO0.isNull(iE7) && vxeVarO0.isNull(iE8)) {
                                        gj2Var = null;
                                    } else {
                                        gj2Var = new gj2(5);
                                        gj2Var.c = vxeVarO0.getBlob(iE7);
                                        gj2Var.b = vxeVarO0.getLong(iE8);
                                    }
                                    bae baeVar4 = new bae();
                                    baeVar4.a = vxeVarO0.getLong(iE);
                                    baeVar4.b = mnl.c(vxeVarO0.isNull(iE2) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE2)));
                                    baeVar4.c = vxeVarO0.getLong(iE3);
                                    baeVar4.d = vxeVarO0.getLong(iE4);
                                    baeVar4.e = s8Var;
                                    baeVar4.f = ye6Var;
                                    baeVar4.g = gj2Var;
                                    baeVar = baeVar4;
                                } else {
                                    baeVar = null;
                                }
                                return baeVar;
                            } finally {
                                vxeVarO0.close();
                            }
                        case 1:
                            vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND server_id=?");
                            try {
                                vxeVarO1.c(1, maeVar2.a);
                                vxeVarO1.c(2, j2);
                                int iE9 = qyj.E(vxeVarO1, "id");
                                int iE10 = qyj.E(vxeVarO1, "recent_type");
                                int iE11 = qyj.E(vxeVarO1, "recent_time");
                                int iE12 = qyj.E(vxeVarO1, "server_id");
                                int iE13 = qyj.E(vxeVarO1, "sticker_id");
                                int iE14 = qyj.E(vxeVarO1, "emoji");
                                int iE15 = qyj.E(vxeVarO1, "gif");
                                int iE16 = qyj.E(vxeVarO1, "gif_id");
                                if (vxeVarO1.M0()) {
                                    if (vxeVarO1.isNull(iE13)) {
                                        s8Var2 = null;
                                    } else {
                                        s8Var2 = new s8();
                                        s8Var2.a = vxeVarO1.getLong(iE13);
                                    }
                                    if (vxeVarO1.isNull(iE14)) {
                                        ye6Var2 = null;
                                    } else {
                                        ye6Var2 = new ye6();
                                        ye6Var2.a = vxeVarO1.B0(iE14);
                                    }
                                    if (vxeVarO1.isNull(iE15) && vxeVarO1.isNull(iE16)) {
                                        gj2Var2 = null;
                                    } else {
                                        gj2Var2 = new gj2(5);
                                        gj2Var2.c = vxeVarO1.getBlob(iE15);
                                        gj2Var2.b = vxeVarO1.getLong(iE16);
                                    }
                                    bae baeVar5 = new bae();
                                    baeVar5.a = vxeVarO1.getLong(iE9);
                                    baeVar5.b = mnl.c(vxeVarO1.isNull(iE10) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE10)));
                                    baeVar5.c = vxeVarO1.getLong(iE11);
                                    baeVar5.d = vxeVarO1.getLong(iE12);
                                    baeVar5.e = s8Var2;
                                    baeVar5.f = ye6Var2;
                                    baeVar5.g = gj2Var2;
                                    baeVar2 = baeVar5;
                                } else {
                                    baeVar2 = null;
                                }
                                return baeVar2;
                            } finally {
                                vxeVarO1.close();
                            }
                        default:
                            vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND gif_id=?");
                            try {
                                vxeVarO2.c(1, maeVar2.a);
                                vxeVarO2.c(2, j2);
                                int iE17 = qyj.E(vxeVarO2, "id");
                                int iE18 = qyj.E(vxeVarO2, "recent_type");
                                int iE19 = qyj.E(vxeVarO2, "recent_time");
                                int iE20 = qyj.E(vxeVarO2, "server_id");
                                int iE21 = qyj.E(vxeVarO2, "sticker_id");
                                int iE22 = qyj.E(vxeVarO2, "emoji");
                                int iE23 = qyj.E(vxeVarO2, "gif");
                                int iE24 = qyj.E(vxeVarO2, "gif_id");
                                if (vxeVarO2.M0()) {
                                    if (vxeVarO2.isNull(iE21)) {
                                        s8Var3 = null;
                                    } else {
                                        s8Var3 = new s8();
                                        s8Var3.a = vxeVarO2.getLong(iE21);
                                    }
                                    if (vxeVarO2.isNull(iE22)) {
                                        ye6Var3 = null;
                                    } else {
                                        ye6Var3 = new ye6();
                                        ye6Var3.a = vxeVarO2.B0(iE22);
                                    }
                                    if (vxeVarO2.isNull(iE23) && vxeVarO2.isNull(iE24)) {
                                        gj2Var3 = null;
                                    } else {
                                        gj2Var3 = new gj2(5);
                                        gj2Var3.c = vxeVarO2.getBlob(iE23);
                                        gj2Var3.b = vxeVarO2.getLong(iE24);
                                    }
                                    bae baeVar6 = new bae();
                                    baeVar6.a = vxeVarO2.getLong(iE17);
                                    baeVar6.b = mnl.c(vxeVarO2.isNull(iE18) ? null : Integer.valueOf((int) vxeVarO2.getLong(iE18)));
                                    baeVar6.c = vxeVarO2.getLong(iE19);
                                    baeVar6.d = vxeVarO2.getLong(iE20);
                                    baeVar6.e = s8Var3;
                                    baeVar6.f = ye6Var3;
                                    baeVar6.g = gj2Var3;
                                    baeVar3 = baeVar6;
                                } else {
                                    baeVar3 = null;
                                }
                                return baeVar3;
                            } finally {
                                vxeVarO2.close();
                            }
                    }
                }
            });
        }
        int iOrdinal = maeVar.ordinal();
        final int i3 = 2;
        if (iOrdinal == 1) {
            return ch3.I(nq4Var, aaeVar.a, true, false, new bad(maeVar, 2, ((e56) eaeVar).c));
        }
        if (iOrdinal == 2) {
            final long j2 = ((cmg) eaeVar).c;
            return ch3.I(nq4Var, aaeVar.a, true, false, new cf7() { // from class: z9e
                @Override // defpackage.cf7
                public final Object invoke(Object obj) throws Exception {
                    bae baeVar;
                    s8 s8Var;
                    ye6 ye6Var;
                    gj2 gj2Var;
                    bae baeVar2;
                    s8 s8Var2;
                    ye6 ye6Var2;
                    gj2 gj2Var2;
                    bae baeVar3;
                    s8 s8Var3;
                    ye6 ye6Var3;
                    gj2 gj2Var3;
                    int i4 = i;
                    long j3 = j2;
                    mae maeVar2 = maeVar;
                    switch (i4) {
                        case 0:
                            vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND sticker_id=?");
                            try {
                                vxeVarO0.c(1, maeVar2.a);
                                vxeVarO0.c(2, j3);
                                int iE = qyj.E(vxeVarO0, "id");
                                int iE2 = qyj.E(vxeVarO0, "recent_type");
                                int iE3 = qyj.E(vxeVarO0, "recent_time");
                                int iE4 = qyj.E(vxeVarO0, "server_id");
                                int iE5 = qyj.E(vxeVarO0, "sticker_id");
                                int iE6 = qyj.E(vxeVarO0, "emoji");
                                int iE7 = qyj.E(vxeVarO0, "gif");
                                int iE8 = qyj.E(vxeVarO0, "gif_id");
                                if (vxeVarO0.M0()) {
                                    if (vxeVarO0.isNull(iE5)) {
                                        s8Var = null;
                                    } else {
                                        s8Var = new s8();
                                        s8Var.a = vxeVarO0.getLong(iE5);
                                    }
                                    if (vxeVarO0.isNull(iE6)) {
                                        ye6Var = null;
                                    } else {
                                        ye6Var = new ye6();
                                        ye6Var.a = vxeVarO0.B0(iE6);
                                    }
                                    if (vxeVarO0.isNull(iE7) && vxeVarO0.isNull(iE8)) {
                                        gj2Var = null;
                                    } else {
                                        gj2Var = new gj2(5);
                                        gj2Var.c = vxeVarO0.getBlob(iE7);
                                        gj2Var.b = vxeVarO0.getLong(iE8);
                                    }
                                    bae baeVar4 = new bae();
                                    baeVar4.a = vxeVarO0.getLong(iE);
                                    baeVar4.b = mnl.c(vxeVarO0.isNull(iE2) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE2)));
                                    baeVar4.c = vxeVarO0.getLong(iE3);
                                    baeVar4.d = vxeVarO0.getLong(iE4);
                                    baeVar4.e = s8Var;
                                    baeVar4.f = ye6Var;
                                    baeVar4.g = gj2Var;
                                    baeVar = baeVar4;
                                } else {
                                    baeVar = null;
                                }
                                return baeVar;
                            } finally {
                                vxeVarO0.close();
                            }
                        case 1:
                            vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND server_id=?");
                            try {
                                vxeVarO1.c(1, maeVar2.a);
                                vxeVarO1.c(2, j3);
                                int iE9 = qyj.E(vxeVarO1, "id");
                                int iE10 = qyj.E(vxeVarO1, "recent_type");
                                int iE11 = qyj.E(vxeVarO1, "recent_time");
                                int iE12 = qyj.E(vxeVarO1, "server_id");
                                int iE13 = qyj.E(vxeVarO1, "sticker_id");
                                int iE14 = qyj.E(vxeVarO1, "emoji");
                                int iE15 = qyj.E(vxeVarO1, "gif");
                                int iE16 = qyj.E(vxeVarO1, "gif_id");
                                if (vxeVarO1.M0()) {
                                    if (vxeVarO1.isNull(iE13)) {
                                        s8Var2 = null;
                                    } else {
                                        s8Var2 = new s8();
                                        s8Var2.a = vxeVarO1.getLong(iE13);
                                    }
                                    if (vxeVarO1.isNull(iE14)) {
                                        ye6Var2 = null;
                                    } else {
                                        ye6Var2 = new ye6();
                                        ye6Var2.a = vxeVarO1.B0(iE14);
                                    }
                                    if (vxeVarO1.isNull(iE15) && vxeVarO1.isNull(iE16)) {
                                        gj2Var2 = null;
                                    } else {
                                        gj2Var2 = new gj2(5);
                                        gj2Var2.c = vxeVarO1.getBlob(iE15);
                                        gj2Var2.b = vxeVarO1.getLong(iE16);
                                    }
                                    bae baeVar5 = new bae();
                                    baeVar5.a = vxeVarO1.getLong(iE9);
                                    baeVar5.b = mnl.c(vxeVarO1.isNull(iE10) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE10)));
                                    baeVar5.c = vxeVarO1.getLong(iE11);
                                    baeVar5.d = vxeVarO1.getLong(iE12);
                                    baeVar5.e = s8Var2;
                                    baeVar5.f = ye6Var2;
                                    baeVar5.g = gj2Var2;
                                    baeVar2 = baeVar5;
                                } else {
                                    baeVar2 = null;
                                }
                                return baeVar2;
                            } finally {
                                vxeVarO1.close();
                            }
                        default:
                            vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND gif_id=?");
                            try {
                                vxeVarO2.c(1, maeVar2.a);
                                vxeVarO2.c(2, j3);
                                int iE17 = qyj.E(vxeVarO2, "id");
                                int iE18 = qyj.E(vxeVarO2, "recent_type");
                                int iE19 = qyj.E(vxeVarO2, "recent_time");
                                int iE20 = qyj.E(vxeVarO2, "server_id");
                                int iE21 = qyj.E(vxeVarO2, "sticker_id");
                                int iE22 = qyj.E(vxeVarO2, "emoji");
                                int iE23 = qyj.E(vxeVarO2, "gif");
                                int iE24 = qyj.E(vxeVarO2, "gif_id");
                                if (vxeVarO2.M0()) {
                                    if (vxeVarO2.isNull(iE21)) {
                                        s8Var3 = null;
                                    } else {
                                        s8Var3 = new s8();
                                        s8Var3.a = vxeVarO2.getLong(iE21);
                                    }
                                    if (vxeVarO2.isNull(iE22)) {
                                        ye6Var3 = null;
                                    } else {
                                        ye6Var3 = new ye6();
                                        ye6Var3.a = vxeVarO2.B0(iE22);
                                    }
                                    if (vxeVarO2.isNull(iE23) && vxeVarO2.isNull(iE24)) {
                                        gj2Var3 = null;
                                    } else {
                                        gj2Var3 = new gj2(5);
                                        gj2Var3.c = vxeVarO2.getBlob(iE23);
                                        gj2Var3.b = vxeVarO2.getLong(iE24);
                                    }
                                    bae baeVar6 = new bae();
                                    baeVar6.a = vxeVarO2.getLong(iE17);
                                    baeVar6.b = mnl.c(vxeVarO2.isNull(iE18) ? null : Integer.valueOf((int) vxeVarO2.getLong(iE18)));
                                    baeVar6.c = vxeVarO2.getLong(iE19);
                                    baeVar6.d = vxeVarO2.getLong(iE20);
                                    baeVar6.e = s8Var3;
                                    baeVar6.f = ye6Var3;
                                    baeVar6.g = gj2Var3;
                                    baeVar3 = baeVar6;
                                } else {
                                    baeVar3 = null;
                                }
                                return baeVar3;
                            } finally {
                                vxeVarO2.close();
                            }
                    }
                }
            });
        }
        if (iOrdinal == 3) {
            final long j3 = ((qm7) eaeVar).c.i;
            return ch3.I(nq4Var, aaeVar.a, true, false, new cf7() { // from class: z9e
                @Override // defpackage.cf7
                public final Object invoke(Object obj) throws Exception {
                    bae baeVar;
                    s8 s8Var;
                    ye6 ye6Var;
                    gj2 gj2Var;
                    bae baeVar2;
                    s8 s8Var2;
                    ye6 ye6Var2;
                    gj2 gj2Var2;
                    bae baeVar3;
                    s8 s8Var3;
                    ye6 ye6Var3;
                    gj2 gj2Var3;
                    int i4 = i3;
                    long j4 = j3;
                    mae maeVar2 = maeVar;
                    switch (i4) {
                        case 0:
                            vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND sticker_id=?");
                            try {
                                vxeVarO0.c(1, maeVar2.a);
                                vxeVarO0.c(2, j4);
                                int iE = qyj.E(vxeVarO0, "id");
                                int iE2 = qyj.E(vxeVarO0, "recent_type");
                                int iE3 = qyj.E(vxeVarO0, "recent_time");
                                int iE4 = qyj.E(vxeVarO0, "server_id");
                                int iE5 = qyj.E(vxeVarO0, "sticker_id");
                                int iE6 = qyj.E(vxeVarO0, "emoji");
                                int iE7 = qyj.E(vxeVarO0, "gif");
                                int iE8 = qyj.E(vxeVarO0, "gif_id");
                                if (vxeVarO0.M0()) {
                                    if (vxeVarO0.isNull(iE5)) {
                                        s8Var = null;
                                    } else {
                                        s8Var = new s8();
                                        s8Var.a = vxeVarO0.getLong(iE5);
                                    }
                                    if (vxeVarO0.isNull(iE6)) {
                                        ye6Var = null;
                                    } else {
                                        ye6Var = new ye6();
                                        ye6Var.a = vxeVarO0.B0(iE6);
                                    }
                                    if (vxeVarO0.isNull(iE7) && vxeVarO0.isNull(iE8)) {
                                        gj2Var = null;
                                    } else {
                                        gj2Var = new gj2(5);
                                        gj2Var.c = vxeVarO0.getBlob(iE7);
                                        gj2Var.b = vxeVarO0.getLong(iE8);
                                    }
                                    bae baeVar4 = new bae();
                                    baeVar4.a = vxeVarO0.getLong(iE);
                                    baeVar4.b = mnl.c(vxeVarO0.isNull(iE2) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE2)));
                                    baeVar4.c = vxeVarO0.getLong(iE3);
                                    baeVar4.d = vxeVarO0.getLong(iE4);
                                    baeVar4.e = s8Var;
                                    baeVar4.f = ye6Var;
                                    baeVar4.g = gj2Var;
                                    baeVar = baeVar4;
                                } else {
                                    baeVar = null;
                                }
                                return baeVar;
                            } finally {
                                vxeVarO0.close();
                            }
                        case 1:
                            vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND server_id=?");
                            try {
                                vxeVarO1.c(1, maeVar2.a);
                                vxeVarO1.c(2, j4);
                                int iE9 = qyj.E(vxeVarO1, "id");
                                int iE10 = qyj.E(vxeVarO1, "recent_type");
                                int iE11 = qyj.E(vxeVarO1, "recent_time");
                                int iE12 = qyj.E(vxeVarO1, "server_id");
                                int iE13 = qyj.E(vxeVarO1, "sticker_id");
                                int iE14 = qyj.E(vxeVarO1, "emoji");
                                int iE15 = qyj.E(vxeVarO1, "gif");
                                int iE16 = qyj.E(vxeVarO1, "gif_id");
                                if (vxeVarO1.M0()) {
                                    if (vxeVarO1.isNull(iE13)) {
                                        s8Var2 = null;
                                    } else {
                                        s8Var2 = new s8();
                                        s8Var2.a = vxeVarO1.getLong(iE13);
                                    }
                                    if (vxeVarO1.isNull(iE14)) {
                                        ye6Var2 = null;
                                    } else {
                                        ye6Var2 = new ye6();
                                        ye6Var2.a = vxeVarO1.B0(iE14);
                                    }
                                    if (vxeVarO1.isNull(iE15) && vxeVarO1.isNull(iE16)) {
                                        gj2Var2 = null;
                                    } else {
                                        gj2Var2 = new gj2(5);
                                        gj2Var2.c = vxeVarO1.getBlob(iE15);
                                        gj2Var2.b = vxeVarO1.getLong(iE16);
                                    }
                                    bae baeVar5 = new bae();
                                    baeVar5.a = vxeVarO1.getLong(iE9);
                                    baeVar5.b = mnl.c(vxeVarO1.isNull(iE10) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE10)));
                                    baeVar5.c = vxeVarO1.getLong(iE11);
                                    baeVar5.d = vxeVarO1.getLong(iE12);
                                    baeVar5.e = s8Var2;
                                    baeVar5.f = ye6Var2;
                                    baeVar5.g = gj2Var2;
                                    baeVar2 = baeVar5;
                                } else {
                                    baeVar2 = null;
                                }
                                return baeVar2;
                            } finally {
                                vxeVarO1.close();
                            }
                        default:
                            vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM recent WHERE recent_type=? AND gif_id=?");
                            try {
                                vxeVarO2.c(1, maeVar2.a);
                                vxeVarO2.c(2, j4);
                                int iE17 = qyj.E(vxeVarO2, "id");
                                int iE18 = qyj.E(vxeVarO2, "recent_type");
                                int iE19 = qyj.E(vxeVarO2, "recent_time");
                                int iE20 = qyj.E(vxeVarO2, "server_id");
                                int iE21 = qyj.E(vxeVarO2, "sticker_id");
                                int iE22 = qyj.E(vxeVarO2, "emoji");
                                int iE23 = qyj.E(vxeVarO2, "gif");
                                int iE24 = qyj.E(vxeVarO2, "gif_id");
                                if (vxeVarO2.M0()) {
                                    if (vxeVarO2.isNull(iE21)) {
                                        s8Var3 = null;
                                    } else {
                                        s8Var3 = new s8();
                                        s8Var3.a = vxeVarO2.getLong(iE21);
                                    }
                                    if (vxeVarO2.isNull(iE22)) {
                                        ye6Var3 = null;
                                    } else {
                                        ye6Var3 = new ye6();
                                        ye6Var3.a = vxeVarO2.B0(iE22);
                                    }
                                    if (vxeVarO2.isNull(iE23) && vxeVarO2.isNull(iE24)) {
                                        gj2Var3 = null;
                                    } else {
                                        gj2Var3 = new gj2(5);
                                        gj2Var3.c = vxeVarO2.getBlob(iE23);
                                        gj2Var3.b = vxeVarO2.getLong(iE24);
                                    }
                                    bae baeVar6 = new bae();
                                    baeVar6.a = vxeVarO2.getLong(iE17);
                                    baeVar6.b = mnl.c(vxeVarO2.isNull(iE18) ? null : Integer.valueOf((int) vxeVarO2.getLong(iE18)));
                                    baeVar6.c = vxeVarO2.getLong(iE19);
                                    baeVar6.d = vxeVarO2.getLong(iE20);
                                    baeVar6.e = s8Var3;
                                    baeVar6.f = ye6Var3;
                                    baeVar6.g = gj2Var3;
                                    baeVar3 = baeVar6;
                                } else {
                                    baeVar3 = null;
                                }
                                return baeVar3;
                            } finally {
                                vxeVarO2.close();
                            }
                    }
                }
            });
        }
        ore.k(String.format(Locale.ENGLISH, "Unexpected value: %s", Arrays.copyOf(new Object[]{maeVar}, 1)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(aae aaeVar, eae eaeVar, nq4 nq4Var) {
        oae oaeVar;
        if (nq4Var instanceof oae) {
            oaeVar = (oae) nq4Var;
            int i = oaeVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                oaeVar.h = i - Integer.MIN_VALUE;
            } else {
                oaeVar = new oae(this, nq4Var);
            }
        } else {
            oaeVar = new oae(this, nq4Var);
        }
        Object objL = oaeVar.f;
        int i2 = oaeVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objL);
            oaeVar.d = aaeVar;
            oaeVar.e = eaeVar;
            oaeVar.h = 1;
            objL = l(aaeVar, eaeVar, oaeVar);
            if (objL != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objL);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        eaeVar = oaeVar.e;
        aaeVar = oaeVar.d;
        ch3.d0(objL);
        bae baeVarA = (bae) objL;
        if (baeVarA == null) {
            baeVarA = jae.a(eaeVar, 0L);
        }
        baeVarA.c = ((s7f) ((et3) this.b.getValue())).f();
        oaeVar.d = null;
        oaeVar.e = null;
        oaeVar.h = 2;
        Object objI = ch3.I(oaeVar, aaeVar.a, false, true, new bad(aaeVar, 3, baeVarA));
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? hu4Var : sbiVar;
    }

    public final void d(sfa sfaVar) {
        List list;
        Object next;
        String str = sfaVar.g;
        List<cga> list2 = sfaVar.D;
        if (p90.D(list2)) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            for (cga cgaVar : list2) {
                if (cgaVar.c == bga.k) {
                    arrayList.add(cgaVar);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        boolean zIsEmpty = arrayList3.isEmpty();
        ny8 ny8Var = this.c;
        if (zIsEmpty) {
            ArrayList arrayListG = ((p4c) ny8Var.getValue()).g(str);
            if (!arrayListG.isEmpty()) {
                p90.K(arrayListG);
                ArrayList arrayList4 = new ArrayList(yw3.W0(arrayListG, 10));
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new e56(((CharSequence) it.next()).toString()));
                }
                arrayList2.addAll(arrayList4);
            }
        } else {
            ArrayList arrayList5 = new ArrayList(((p4c) ny8Var.getValue()).k.a().d(str));
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                ylc ylcVar = (ylc) arrayList5.get(i);
                CharSequence charSequence = (CharSequence) ylcVar.a;
                hj8 hj8Var = (hj8) ylcVar.b;
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((cga) next).d != hj8Var.a);
                cga cgaVar2 = (cga) next;
                if (cgaVar2 != null) {
                    arrayList2.add(new im(cgaVar2.a));
                    arrayList3.remove(cgaVar2);
                } else {
                    arrayList2.add(new e56(charSequence.toString()));
                }
            }
        }
        c46 c46Var = sfaVar.n;
        List list3 = c46Var != null ? (List) c46Var.a : null;
        if (list3 == null) {
            list3 = r66.a;
        }
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            w60 w60Var = ((e70) it3.next()).f;
            if (w60Var != null) {
                long j = w60Var.a;
                if (j != 0) {
                    arrayList2.add(new cmg(j, j));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        yab.i0((gu4) this.f.getValue(), null, 0, new l0d(this, arrayList2, null, 29), 3);
    }

    public final Object e(nq4 nq4Var) {
        gm0.n("wae", "Clear");
        Object objI = ch3.I(nq4Var, g().a, false, true, new skd(15));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) {
        qae qaeVar;
        ArrayList arrayList;
        if (nq4Var instanceof qae) {
            qaeVar = (qae) nq4Var;
            int i = qaeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qaeVar.g = i - Integer.MIN_VALUE;
            } else {
                qaeVar = new qae(this, nq4Var);
            }
        } else {
            qaeVar = new qae(this, nq4Var);
        }
        Object objP = qaeVar.e;
        int i2 = qaeVar.g;
        ArrayList arrayList2 = null;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objP);
            gfb gfbVar = new gfb(g().a(Collections.singletonList(mae.STICKER)), 3);
            qaeVar.g = 1;
            objP = e9i.P(gfbVar, qaeVar);
            if (objP != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ch3.d0(objP);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = qaeVar.d;
            ch3.d0(objP);
        }
        ((pvb) this.d.getValue()).c(6, p90.i(arrayList));
        return Boolean.TRUE;
        List<eae> list = (List) objP;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (eae eaeVar : list) {
                cmg cmgVar = eaeVar instanceof cmg ? (cmg) eaeVar : null;
                Long l = cmgVar != null ? new Long(cmgVar.c) : null;
                if (l != null) {
                    arrayList3.add(l);
                }
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return Boolean.FALSE;
        }
        qaeVar.d = arrayList2;
        qaeVar.g = 2;
        if (j(list, qaeVar) != obj) {
            arrayList = arrayList2;
            ((pvb) this.d.getValue()).c(6, p90.i(arrayList));
            return Boolean.TRUE;
        }
        return obj;
    }

    public final aae g() {
        return (aae) this.a.getValue();
    }

    public final gfb h() {
        return new gfb(g().a(Collections.singletonList(mae.STICKER)), 5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(List list, nq4 nq4Var) {
        uae uaeVar;
        if (nq4Var instanceof uae) {
            uaeVar = (uae) nq4Var;
            int i = uaeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                uaeVar.g = i - Integer.MIN_VALUE;
            } else {
                uaeVar = new uae(this, nq4Var);
            }
        } else {
            uaeVar = new uae(this, nq4Var);
        }
        Object obj = uaeVar.e;
        int i2 = uaeVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            List list2 = list;
            ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                arrayList.add(new cmg(jLongValue, jLongValue));
            }
            uaeVar.d = list;
            uaeVar.g = 1;
            Object objJ = j(arrayList, uaeVar);
            Object obj2 = hu4.a;
            if (objJ == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = uaeVar.d;
            ch3.d0(obj);
        }
        ((pvb) this.d.getValue()).c(6, p90.i(list));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r15 == r10) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:26:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.util.List r14, defpackage.nq4 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.vae
            if (r0 == 0) goto L13
            r0 = r15
            vae r0 = (defpackage.vae) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            vae r0 = new vae
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.i
            int r1 = r0.k
            r2 = 2
            r3 = 1
            sbi r4 = defpackage.sbi.a
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L42
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.ch3.d0(r15)
            return r4
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            return r6
        L32:
            int r14 = r0.h
            int r1 = r0.g
            int r7 = r0.f
            java.util.Iterator r8 = r0.e
            java.util.Collection r9 = r0.d
            java.util.Collection r9 = (java.util.Collection) r9
            defpackage.ch3.d0(r15)
            goto L84
        L42:
            defpackage.ch3.d0(r15)
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L4c
            goto Lb0
        L4c:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
            r8 = r14
            r9 = r15
            r14 = r5
            r1 = r14
            r7 = r1
        L5c:
            boolean r15 = r8.hasNext()
            hu4 r10 = defpackage.hu4.a
            if (r15 == 0) goto L8c
            java.lang.Object r15 = r8.next()
            eae r15 = (defpackage.eae) r15
            aae r11 = r13.g()
            r12 = r9
            java.util.Collection r12 = (java.util.Collection) r12
            r0.d = r12
            r0.e = r8
            r0.f = r7
            r0.g = r1
            r0.h = r14
            r0.k = r3
            java.lang.Object r15 = l(r11, r15, r0)
            if (r15 != r10) goto L84
            goto Laf
        L84:
            bae r15 = (defpackage.bae) r15
            if (r15 == 0) goto L5c
            r9.add(r15)
            goto L5c
        L8c:
            java.util.List r9 = (java.util.List) r9
            boolean r14 = r9.isEmpty()
            if (r14 != 0) goto Lb0
            aae r13 = r13.g()
            r0.d = r6
            r0.e = r6
            r0.k = r2
            rre r14 = r13.a
            y9e r15 = new y9e
            r15.<init>(r13, r9, r3)
            java.lang.Object r13 = defpackage.ch3.I(r0, r14, r5, r3, r15)
            if (r13 != r10) goto Lac
            goto Lad
        Lac:
            r13 = r4
        Lad:
            if (r13 != r10) goto Lb0
        Laf:
            return r10
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wae.j(java.util.List, nq4):java.lang.Object");
    }

    public final Object k(ArrayList arrayList, ryf ryfVar) {
        gm0.m("wae", "Replace recents. New size = %d", new Integer(arrayList.size()));
        aae aaeVarG = g();
        long jF = ((s7f) ((et3) this.b.getValue())).f();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(jae.a((eae) arrayList.get(i), jF - ((long) i)));
        }
        Object objH = ch3.H(ryfVar, new wj1(aaeVarG, arrayList2, null, 6), aaeVarG.a);
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objH != hu4Var) {
            objH = sbiVar;
        }
        return objH == hu4Var ? objH : sbiVar;
    }
}
