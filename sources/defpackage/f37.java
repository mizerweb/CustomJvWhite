package defpackage;

import android.net.Uri;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.a;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f37 extends a8j {
    public static final /* synthetic */ zv8[] D = {new z8b(f37.class, "addChatsClickJob", "getAddChatsClickJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, f37.class, "addChatsResultJob", "getAddChatsResultJob()Lkotlinx/coroutines/Job;"), new z8b(f37.class, "memberDeleteJob", "getMemberDeleteJob()Lkotlinx/coroutines/Job;"), new z8b(f37.class, "filterSwitchJob", "getFilterSwitchJob()Lkotlinx/coroutines/Job;"), new z8b(f37.class, "expandCollapseJob", "getExpandCollapseJob()Lkotlinx/coroutines/Job;"), new z8b(f37.class, "saveJob", "getSaveJob()Lkotlinx/coroutines/Job;")};
    public final p3c A;
    public final p3c B;
    public final p3c C;
    public final String c;
    public final xhh d;
    public final sy4 e;
    public final c27 f;
    public final sfi g;
    public final f27 h;
    public final String i = f37.class.getName();
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final mjg n;
    public final r8e o;
    public final mjg p;
    public final r8e q;
    public final ic6 r;
    public final CopyOnWriteArraySet s;
    public final CopyOnWriteArraySet t;
    public final CopyOnWriteArraySet u;
    public final CopyOnWriteArraySet v;
    public volatile r17 w;
    public final p3c x;
    public final p3c y;
    public final p3c z;

    public f37(String str, long[] jArr, xhh xhhVar, sy4 sy4Var, c27 c27Var, sfi sfiVar, f27 f27Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = str;
        this.d = xhhVar;
        this.e = sy4Var;
        this.f = c27Var;
        this.g = sfiVar;
        this.h = f27Var;
        this.j = ny8Var;
        this.k = ny8Var2;
        this.l = ny8Var3;
        this.m = ny8Var4;
        mjg mjgVarA = p90.a(new u27());
        this.n = mjgVarA;
        this.o = new r8e(mjgVarA);
        r66 r66Var = r66.a;
        mjg mjgVarA2 = p90.a(r66Var);
        this.p = mjgVarA2;
        this.q = new r8e(mjgVarA2);
        CharSequence charSequence = null;
        this.r = new ic6(null);
        this.s = new CopyOnWriteArraySet();
        this.t = new CopyOnWriteArraySet();
        this.u = new CopyOnWriteArraySet();
        this.v = new CopyOnWriteArraySet();
        this.x = qyj.S();
        this.y = qyj.S();
        this.z = qyj.S();
        this.A = qyj.S();
        this.B = qyj.S();
        this.C = qyj.S();
        if (str != null) {
            mjgVarA.j(null, new v27(str, charSequence, 5));
            a8j.t(this, ((n0c) xhhVar).a(), new gv7(6, null, this, str, ny8Var4, ny8Var2), 2);
        } else {
            mjgVarA.j(null, new u27());
            if (jArr.length == 0) {
                mjgVarA2.setValue(G(r66Var, ny8Var2));
            } else {
                a8j.t(this, ((n0c) xhhVar).b(), new y27(jArr, this, ny8Var2, null), 2);
            }
        }
    }

    public static final void B(f37 f37Var, boolean z, i37 i37Var) {
        Set set;
        Object value;
        r17 r17Var = f37Var.w;
        if (z) {
            f37Var.v.remove(i37Var);
            if (r17Var == null || !r17Var.d.contains(i37Var)) {
                f37Var.u.add(i37Var);
            }
        } else {
            f37Var.u.remove(i37Var);
            if (r17Var != null && (set = r17Var.d) != null && set.contains(i37Var)) {
                f37Var.v.add(i37Var);
            }
        }
        if (f37Var.n.getValue() instanceof v27) {
            mjg mjgVar = f37Var.n;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, v27.b((v27) ((w27) value), null, f37Var.N(null), 3)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object C(f37 f37Var, r17 r17Var, ArrayList arrayList, ny8 ny8Var, nq4 nq4Var) {
        z27 z27Var;
        ArrayList arrayList2;
        Object objM;
        ny8 ny8Var2;
        int i;
        vg4 vg4VarW;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof z27) {
            z27Var = (z27) nq4Var;
            int i2 = z27Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z27Var.h = i2 - Integer.MIN_VALUE;
            } else {
                z27Var = new z27(f37Var, nq4Var);
            }
        } else {
            z27Var = new z27(f37Var, nq4Var);
        }
        Object obj = z27Var.f;
        Object obj2 = hu4.a;
        int i3 = z27Var.h;
        if (i3 == 0) {
            ch3.d0(obj);
            arrayList2 = arrayList;
            z27Var.d = arrayList2;
            z27Var.e = ny8Var;
            z27Var.h = 1;
            objM = f37Var.M(r17Var, z27Var);
            if (objM == obj2) {
                return obj2;
            }
            ny8Var2 = ny8Var;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ny8Var2 = z27Var.e;
            ArrayList arrayList3 = z27Var.d;
            ch3.d0(obj);
            objM = obj;
            arrayList2 = arrayList3;
        }
        List list = (List) objM;
        if (list.isEmpty()) {
            gm0.n(f37Var.i, "Can't fill included chats because is empty");
            return sbiVar;
        }
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((k79) it.next()) instanceof l37) && (i = i + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        k79 k79Var = (k79) ww3.D1(arrayList2);
        int i4 = 1073741828;
        if ((k79Var instanceof l37) && !list.isEmpty()) {
            arrayList2.set(xw3.O0(arrayList2), l37.i((l37) k79Var, 1073741828));
        }
        int i5 = 0;
        int i6 = i;
        for (Object obj3 : list) {
            int i7 = i5 + 1;
            if (i5 < 0) {
                xw3.V0();
                throw null;
            }
            rt2 rt2Var = (rt2) obj3;
            int i8 = i6 + 1;
            if (i8 > 5) {
                arrayList2.add(new s17(R.drawable.icon_chevron_down, new vnh(R.string.oneme_folders_edit_expand, a.n1(new Object[]{new Integer(list.size() + i)})), 1, 9223372036854775804L, -2147483646));
                return sbiVar;
            }
            Uri uriL = L(rt2Var);
            int i9 = i5 == list.size() - 1 ? -2147483644 : i4;
            long jA = rt2Var.A();
            String string = uriL != null ? uriL.toString() : null;
            ((e13) ny8Var2.getValue()).getClass();
            rt2Var.K0();
            xnh xnhVar = new xnh(rt2Var.j);
            long jQ = rt2Var.q();
            rt2Var.L0();
            arrayList2.add(new l37(jA, xnhVar, string, new Long(jQ), rt2Var.m, rt2Var.u0() || ((vg4VarW = rt2Var.w()) != null && vg4VarW.G()), null, i9, 64));
            i6 = i8;
            i5 = i7;
            i4 = 1073741828;
        }
        return sbiVar;
    }

    public static final Object D(f37 f37Var, Throwable th, t20 t20Var) {
        boolean z = th instanceof TamErrorException;
        hu4 hu4Var = hu4.a;
        if (z) {
            yhh yhhVar = ((TamErrorException) th).a;
            dih dihVarA = svl.a(yhhVar);
            if (dihVarA instanceof cih) {
                Object objQ = Q(f37Var, new xnh(((cih) dihVarA).a), t20Var);
                if (objQ == hu4Var) {
                    return objQ;
                }
            } else if (dihVarA instanceof aih) {
                Object objK0 = yab.K0(((n0c) f37Var.d).c(), new fze(f37Var, new tnh(R.string.snack_network_error_title), new tnh(R.string.snack_network_error_description), null, 29), t20Var);
                if (objK0 == hu4Var) {
                    return objK0;
                }
            } else if (dihVarA instanceof bih) {
                Object objQ2 = Q(f37Var, new tnh(R.string.common_service_error), t20Var);
                if (objQ2 == hu4Var) {
                    return objQ2;
                }
            } else {
                if (!(dihVarA instanceof zhh)) {
                    ore.o();
                    return null;
                }
                if (cqk.d(yhhVar.b, "folder.max.count")) {
                    Object objQ3 = Q(f37Var, new tnh(R.string.oneme_folders_error_max_count), t20Var);
                    if (objQ3 == hu4Var) {
                        return objQ3;
                    }
                } else {
                    Object objQ4 = Q(f37Var, new tnh(R.string.common_service_error), t20Var);
                    if (objQ4 == hu4Var) {
                        return objQ4;
                    }
                }
            }
        } else {
            Object objQ5 = Q(f37Var, new tnh(R.string.common_service_error), t20Var);
            if (objQ5 == hu4Var) {
                return objQ5;
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00cd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r40v0, types: [f37] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:19:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:130:0x00ec
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object E(defpackage.f37 r40, boolean r41, defpackage.nq4 r42) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f37.E(f37, boolean, nq4):java.lang.Object");
    }

    public static Uri L(rt2 rt2Var) {
        String strS = rt2Var.s(us0.b, rs0.a);
        if (strS != null) {
            if (r5h.X0(strS)) {
                strS = null;
            }
            if (strS != null) {
                return sb8.K(strS);
            }
        }
        return null;
    }

    public static void P(i37 i37Var, AbstractList abstractList) {
        switch (i37Var.ordinal()) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            case 12:
            case 13:
                break;
            case 2:
                Object obj = i37.f.get(i37Var);
                if (obj == null) {
                    ore.p("Required value was null.");
                } else {
                    abstractList.add(new l37(((Number) obj).longValue(), new tnh(R.string.folder_filter_channels), null, null, null, false, Integer.valueOf(R.drawable.icon_megaphone), 1073741828, 60));
                }
                break;
            case 3:
                Object obj2 = i37.f.get(i37Var);
                if (obj2 == null) {
                    ore.p("Required value was null.");
                } else {
                    abstractList.add(new l37(((Number) obj2).longValue(), new tnh(R.string.folder_filter_type_chats), null, null, null, false, Integer.valueOf(R.drawable.icon_users), 1073741828, 60));
                }
                break;
            case 8:
                Object obj3 = i37.f.get(i37Var);
                if (obj3 == null) {
                    ore.p("Required value was null.");
                } else {
                    abstractList.add(new l37(((Number) obj3).longValue(), new tnh(R.string.folder_filter_contacts), null, null, null, false, Integer.valueOf(R.drawable.icon_user), 1073741828, 60));
                }
                break;
            case 9:
                Object obj4 = i37.f.get(i37Var);
                if (obj4 == null) {
                    ore.p("Required value was null.");
                } else {
                    abstractList.add(new l37(((Number) obj4).longValue(), new tnh(R.string.folder_filter_not_contacts), null, null, null, false, Integer.valueOf(R.drawable.icon_user_crossed), 1073741828, 60));
                }
                break;
            case 10:
                Object obj5 = i37.f.get(i37Var);
                if (obj5 == null) {
                    ore.p("Required value was null.");
                } else {
                    abstractList.add(new l37(((Number) obj5).longValue(), new tnh(R.string.folder_filter_bots), null, null, null, false, Integer.valueOf(R.drawable.icon_bot), 1073741828, 60));
                }
                break;
            default:
                ore.o();
                break;
        }
    }

    public static Object Q(f37 f37Var, ynh ynhVar, t20 t20Var) {
        lq4 lq4Var = null;
        return yab.K0(((n0c) f37Var.d).c(), new fze(f37Var, ynhVar, lq4Var, lq4Var, 29), t20Var);
    }

    public final boolean F() {
        r17 r17Var = this.w;
        if (r17Var != null) {
            return !r17Var.i.contains(s37.NO_FILTERS_EDIT);
        }
        return true;
    }

    public final c79 G(List list, ny8 ny8Var) {
        vg4 vg4VarW;
        r17 r17Var = this.w;
        xnh xnhVar = null;
        Set set = r17Var != null ? r17Var.i : null;
        if (set == null) {
            set = c76.a;
        }
        r27 r27Var = new r27(xnhVar, !set.contains(s37.NO_TITLE_EDIT));
        p27 p27Var = new p27(new tnh(R.string.oneme_folders_edit_name_section), 9223372036854775801L);
        p27 p27Var2 = new p27(new tnh(R.string.oneme_folders_edit_members_section), 9223372036854775800L);
        c79 c79VarW = yab.w();
        c79VarW.add(p27Var);
        c79VarW.add(r27Var);
        c79VarW.add(p27Var2);
        c79VarW.add(new s17(R.drawable.icon_plus, new tnh(R.string.oneme_folders_edit_add_chats_button), 1, 9223372036854775806L, !list.isEmpty() ? 536870914 : 2));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            rt2 rt2Var = (rt2) obj;
            Uri uriL = L(rt2Var);
            int i3 = (list.size() != 1 && (i == 0 || i != xw3.O0(list))) ? 1073741828 : -2147483644;
            long jA = rt2Var.A();
            ((e13) ny8Var.getValue()).getClass();
            rt2Var.K0();
            xnh xnhVar2 = new xnh(rt2Var.j);
            String string = uriL != null ? uriL.toString() : null;
            Long lValueOf = Long.valueOf(rt2Var.q());
            rt2Var.L0();
            c79VarW.add(new l37(jA, xnhVar2, string, lValueOf, rt2Var.m, rt2Var.u0() || ((vg4VarW = rt2Var.w()) != null && vg4VarW.G()), null, i3, 64));
            i = i2;
        }
        if (F()) {
            c79VarW.add(new j27(new tnh(R.string.oneme_folders_edit_members_description)));
            K(null, c79VarW);
        }
        return yab.j(c79VarW);
    }

    public final void H(i37 i37Var, CopyOnWriteArraySet copyOnWriteArraySet, CopyOnWriteArraySet copyOnWriteArraySet2) {
        Object value;
        if (i37.e.contains(i37Var)) {
            if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
                copyOnWriteArraySet2.add(i37Var);
                break;
            }
            Iterator it = copyOnWriteArraySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    copyOnWriteArraySet2.add(i37Var);
                    break;
                } else if (((i37) it.next()) == i37Var) {
                    copyOnWriteArraySet.removeIf(new u6(7, new nv4(11, i37Var)));
                    break;
                }
            }
            mjg mjgVar = this.n;
            if (mjgVar.getValue() instanceof v27) {
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, v27.b((v27) ((w27) value), null, true, 3)));
            }
        }
    }

    public final void I(long j) {
        Object value;
        CopyOnWriteArraySet copyOnWriteArraySet = this.s;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
            this.t.add(Long.valueOf(j));
            break;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.t.add(Long.valueOf(j));
                break;
            } else if (((rt2) it.next()).A() == j) {
                copyOnWriteArraySet.removeIf(new u6(4, new aa2(j, 9)));
                break;
            }
        }
        mjg mjgVar = this.n;
        if (mjgVar.getValue() instanceof v27) {
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, v27.b((v27) ((w27) value), null, N(null), 3)));
        }
    }

    public final void J(r17 r17Var, AbstractList abstractList) {
        Set<i37> set;
        if (F()) {
            if (r17Var != null && (set = r17Var.d) != null) {
                for (i37 i37Var : set) {
                    if (!this.v.contains(i37Var)) {
                        P(i37Var, abstractList);
                    }
                }
            }
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                P((i37) it.next(), abstractList);
            }
            k79 k79Var = (k79) ww3.D1(abstractList);
            if (k79Var instanceof l37) {
                abstractList.set(xw3.O0(abstractList), l37.i((l37) k79Var, -2147483644));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    public final void K(r17 r17Var, List list) {
        boolean z;
        boolean z2;
        Set set;
        Set set2;
        list.add(new p27(new tnh(R.string.oneme_folders_edit_filter_section), 9223372036854775799L));
        CopyOnWriteArraySet copyOnWriteArraySet = this.u;
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.v;
        if (r17Var != null && (set2 = r17Var.d) != null && !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (true) {
                if (it.hasNext()) {
                    i37 i37Var = (i37) it.next();
                    i37 i37Var2 = i37.NOT_MUTED;
                    if (i37Var == i37Var2) {
                        if (!copyOnWriteArraySet2.contains(i37Var2)) {
                            z = true;
                        }
                    }
                }
                if (copyOnWriteArraySet.contains(i37.NOT_MUTED)) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else if (copyOnWriteArraySet.contains(i37.NOT_MUTED)) {
            z = true;
        } else {
            z = false;
        }
        if (r17Var == null || (set = r17Var.d) == null || set.isEmpty()) {
            z2 = copyOnWriteArraySet.contains(i37.UNREAD);
        } else {
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    i37 i37Var3 = (i37) it2.next();
                    i37 i37Var4 = i37.UNREAD;
                    if (i37Var3 == i37Var4 || i37Var3 == i37.MARKED_UNREAD) {
                        if (copyOnWriteArraySet2.contains(i37Var4)) {
                        }
                    }
                }
                if (copyOnWriteArraySet.contains(i37.UNREAD)) {
                }
            }
        }
        list.add(new o27(9223372036854775757L, new tnh(R.string.oneme_folders_edit_filter_unmute), aql.a(R.drawable.icon_notifications), new ksf(z, true), 536870928));
        list.add(new o27(9223372036854775756L, new tnh(R.string.oneme_folders_edit_filter_unread), aql.a(R.drawable.icon_message_unread), new ksf(z2, true), -2147483632));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final Object M(r17 r17Var, nq4 nq4Var) {
        b37 b37Var;
        List listO1;
        if (nq4Var instanceof b37) {
            b37Var = (b37) nq4Var;
            int i = b37Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                b37Var.f = i - Integer.MIN_VALUE;
            } else {
                b37Var = new b37(this, nq4Var);
            }
        } else {
            b37Var = new b37(this, nq4Var);
        }
        Object objC = b37Var.d;
        int i2 = b37Var.f;
        ?? r3 = 0;
        r3 = 0;
        if (i2 == 0) {
            ch3.d0(objC);
            if (r17Var != null) {
                Set set = r17Var.e;
                dq4 dq4VarA = cqk.a(b37Var.getContext());
                ArrayList arrayList = new ArrayList(yw3.W0(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(yab.h(dq4VarA, null, 0, new a37(it.next(), r3, this, 0), 3));
                }
                b37Var.f = 1;
                objC = ch3.c(arrayList, b37Var);
                hu4 hu4Var = hu4.a;
                if (objC == hu4Var) {
                    return hu4Var;
                }
            }
            if (r3 == 0) {
                r3 = listO1;
                return r66.a;
            }
            r3 = listO1;
            return r3;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objC);
        List list = (List) objC;
        if (list != null) {
            listO1 = ww3.o1(list);
        }
        if (r3 == 0) {
            r3 = listO1;
            return r66.a;
        }
        r3 = listO1;
        return r3;
    }

    public final boolean N(CharSequence charSequence) {
        r17 r17Var = this.w;
        if (r17Var != null) {
            Object value = this.n.getValue();
            v27 v27Var = value instanceof v27 ? (v27) value : null;
            if (v27Var != null) {
                if (charSequence == null) {
                    charSequence = v27Var.a;
                }
                boolean z = charSequence == null || charSequence.length() == 0;
                boolean z2 = (z || z5h.E0(charSequence, r17Var.b)) ? false : true;
                boolean z3 = (this.s.isEmpty() && this.t.isEmpty()) ? false : true;
                boolean z4 = (this.u.isEmpty() && this.v.isEmpty()) ? false : true;
                if (!z2 && ((!z3 && !z4) || z)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void O(boolean z) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) this.d).a(), 2, new g02(this, z, null, 3));
        this.B.B(this, D[4], sggVarH0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0072 -> B:20:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object R(java.util.LinkedHashSet r11, defpackage.nq4 r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f37.R(java.util.LinkedHashSet, nq4):java.lang.Object");
    }
}
