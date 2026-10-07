package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class t6b implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public /* synthetic */ t6b(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0191  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x0229  */
    /* JADX WARN: Code duplicated, block: B:150:0x0261  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:192:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:207:0x0332  */
    /* JADX WARN: Code duplicated, block: B:238:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:253:0x0444  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:270:0x0481  */
    /* JADX WARN: Code duplicated, block: B:295:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:310:0x052c  */
    /* JADX WARN: Code duplicated, block: B:325:0x056c  */
    /* JADX WARN: Code duplicated, block: B:342:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:359:0x05df  */
    /* JADX WARN: Code duplicated, block: B:376:0x0617  */
    /* JADX WARN: Code duplicated, block: B:393:0x0656  */
    /* JADX WARN: Code duplicated, block: B:417:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:460:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:475:0x0835  */
    /* JADX WARN: Code duplicated, block: B:494:0x088f  */
    /* JADX WARN: Code duplicated, block: B:513:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:532:0x0962  */
    /* JADX WARN: Code duplicated, block: B:551:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0158  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v43, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        s6b s6bVar;
        veb vebVar;
        web webVar;
        ffb ffbVar;
        hfb hfbVar;
        yec yecVar;
        kgc kgcVar;
        Object objJ;
        lic licVar;
        Object yhcVar;
        knc kncVar;
        mnc mncVar;
        ewc ewcVar;
        jyc jycVar;
        nyc nycVar;
        h1d h1dVar;
        r1d r1dVar;
        ff2 ff2VarA;
        i6d i6dVar;
        k6d k6dVar;
        x7d x7dVar;
        atd atdVar;
        ftd ftdVar;
        gtd gtdVar;
        Object spannableStringBuilder;
        ytd ytdVar;
        myd mydVar;
        u0e u0eVar;
        y7e y7eVar;
        pae paeVar;
        rae raeVar;
        sae saeVar;
        uce uceVar;
        gde gdeVar;
        int i = this.a;
        int i2 = 0;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        Object obj2 = hu4.a;
        switch (i) {
            case 0:
                if (lq4Var instanceof s6b) {
                    s6bVar = (s6b) lq4Var;
                    int i3 = s6bVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        s6bVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        s6bVar = new s6b(this, lq4Var);
                    }
                } else {
                    s6bVar = new s6b(this, lq4Var);
                }
                Object obj3 = s6bVar.d;
                int i4 = s6bVar.e;
                if (i4 == 0) {
                    ch3.d0(obj3);
                    Object objValueOf = Boolean.valueOf(((Number) obj).longValue() != -1);
                    s6bVar.e = 1;
                    return yx6Var.emit(objValueOf, s6bVar) == obj2 ? obj2 : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj3);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lq4Var instanceof veb) {
                    vebVar = (veb) lq4Var;
                    int i5 = vebVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        vebVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        vebVar = new veb(this, lq4Var);
                    }
                } else {
                    vebVar = new veb(this, lq4Var);
                }
                Object obj4 = vebVar.d;
                int i6 = vebVar.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj4);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj4);
                ik0 ik0Var = (ik0) obj;
                Object defVar = ik0Var != null ? new def(ik0Var.a, ik0Var.b, ik0Var.c, ik0Var.d) : null;
                vebVar.e = 1;
                return yx6Var.emit(defVar, vebVar) == obj2 ? obj2 : sbiVar;
            case 2:
                if (lq4Var instanceof web) {
                    webVar = (web) lq4Var;
                    int i7 = webVar.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        webVar.e = i7 - Integer.MIN_VALUE;
                    } else {
                        webVar = new web(this, lq4Var);
                    }
                } else {
                    webVar = new web(this, lq4Var);
                }
                Object obj5 = webVar.d;
                int i8 = webVar.e;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ch3.d0(obj5);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj5);
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new owb(String.valueOf(((Number) entry.getKey()).intValue()), (String) entry.getValue(), 2, null, null, 120));
                }
                webVar.e = 1;
                return yx6Var.emit(arrayList, webVar) == obj2 ? obj2 : sbiVar;
            case 3:
                if (lq4Var instanceof ffb) {
                    ffbVar = (ffb) lq4Var;
                    int i9 = ffbVar.e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ffbVar.e = i9 - Integer.MIN_VALUE;
                    } else {
                        ffbVar = new ffb(this, lq4Var);
                    }
                } else {
                    ffbVar = new ffb(this, lq4Var);
                }
                Object obj6 = ffbVar.d;
                int i10 = ffbVar.e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ch3.d0(obj6);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj6);
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(zwk.b((dk1) it.next()));
                }
                ffbVar.e = 1;
                return yx6Var.emit(arrayList2, ffbVar) == obj2 ? obj2 : sbiVar;
            case 4:
                if (lq4Var instanceof hfb) {
                    hfbVar = (hfb) lq4Var;
                    int i11 = hfbVar.e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        hfbVar.e = i11 - Integer.MIN_VALUE;
                    } else {
                        hfbVar = new hfb(this, lq4Var);
                    }
                } else {
                    hfbVar = new hfb(this, lq4Var);
                }
                Object obj7 = hfbVar.d;
                int i12 = hfbVar.e;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ch3.d0(obj7);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj7);
                List list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(yw3.W0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(zwk.b((dk1) it2.next()));
                }
                hfbVar.e = 1;
                return yx6Var.emit(arrayList3, hfbVar) == obj2 ? obj2 : sbiVar;
            case 5:
                if (lq4Var instanceof yec) {
                    yecVar = (yec) lq4Var;
                    int i13 = yecVar.e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        yecVar.e = i13 - Integer.MIN_VALUE;
                    } else {
                        yecVar = new yec(this, lq4Var);
                    }
                } else {
                    yecVar = new yec(this, lq4Var);
                }
                Object obj8 = yecVar.d;
                int i14 = yecVar.e;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ch3.d0(obj8);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj8);
                Object obj9 = ((roe) obj).a;
                ch3.d0(obj9);
                yecVar.e = 1;
                return yx6Var.emit(obj9, yecVar) == obj2 ? obj2 : sbiVar;
            case 6:
                if (lq4Var instanceof kgc) {
                    kgcVar = (kgc) lq4Var;
                    int i15 = kgcVar.e;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        kgcVar.e = i15 - Integer.MIN_VALUE;
                    } else {
                        kgcVar = new kgc(this, lq4Var);
                    }
                } else {
                    kgcVar = new kgc(this, lq4Var);
                }
                Object obj10 = kgcVar.d;
                int i16 = kgcVar.e;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ch3.d0(obj10);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj10);
                l49 l49Var = (l49) obj;
                if (l49Var instanceof c49) {
                    uuf uufVar = uuf.b;
                    long j = ((c49) l49Var).a;
                    uufVar.getClass();
                    n65 n65Var = new n65();
                    n65Var.a = ":chats";
                    n65Var.d(Long.valueOf(j), "id");
                    n65Var.d("local", "type");
                    objJ = new i65(n65Var.b());
                } else if (l49Var instanceof e49) {
                    uuf uufVar2 = uuf.b;
                    long j2 = ((e49) l49Var).a;
                    uufVar2.getClass();
                    objJ = new i65(":profile?id=" + j2 + "&type=contact");
                } else if (l49Var instanceof f49) {
                    uuf uufVar3 = uuf.b;
                    f49 f49Var = (f49) l49Var;
                    long j3 = f49Var.a;
                    String str = f49Var.b;
                    uufVar3.getClass();
                    n65 n65Var2 = new n65();
                    n65Var2.a = ":chats";
                    n65Var2.d(Long.valueOf(j3), "id");
                    n65Var2.d("local", "type");
                    if (str != null) {
                        n65Var2.d(str, ApiProtocol.PARAM_PAYLOAD);
                    }
                    objJ = new i65(n65Var2.b());
                } else if (cqk.d(l49Var, k39.a)) {
                    objJ = new jgc(new tnh(R.string.link_info_error));
                } else if (l49Var instanceof i39) {
                    uuf uufVar4 = uuf.b;
                    i39 i39Var = (i39) l49Var;
                    long j4 = i39Var.a;
                    String str2 = i39Var.b;
                    uufVar4.getClass();
                    n65 n65Var3 = new n65();
                    n65Var3.a = ":join";
                    n65Var3.d(Long.valueOf(j4), "id");
                    n65Var3.c("link", str2);
                    objJ = new i65(n65Var3.b());
                } else if (l49Var instanceof s39) {
                    objJ = new hgc(((s39) l49Var).a);
                } else if (l49Var instanceof w39) {
                    objJ = new igc(((w39) l49Var).a);
                } else if (l49Var instanceof a49) {
                    uuf uufVar5 = uuf.b;
                    a49 a49Var = (a49) l49Var;
                    long j5 = a49Var.a;
                    String str3 = a49Var.b;
                    uufVar5.getClass();
                    objJ = uuf.j(j5, str3);
                } else {
                    objJ = null;
                }
                kgcVar.e = 1;
                return yx6Var.emit(objJ, kgcVar) == obj2 ? obj2 : sbiVar;
            case 7:
                if (lq4Var instanceof lic) {
                    licVar = (lic) lq4Var;
                    int i17 = licVar.e;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        licVar.e = i17 - Integer.MIN_VALUE;
                    } else {
                        licVar = new lic(this, lq4Var);
                    }
                } else {
                    licVar = new lic(this, lq4Var);
                }
                Object obj11 = licVar.d;
                int i18 = licVar.e;
                if (i18 != 0) {
                    if (i18 == 1) {
                        ch3.d0(obj11);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj11);
                zhc zhcVar = (zhc) obj;
                if (zhcVar != null) {
                    long j6 = zhcVar.a;
                    String str4 = zhcVar.b;
                    String str5 = zhcVar.c;
                    Long l = zhcVar.d;
                    Long l2 = zhcVar.e;
                    long j7 = zhcVar.f;
                    String str6 = zhcVar.g;
                    List list3 = zhcVar.h;
                    yhcVar = new yhc(j6, str4, j7, str5, l, l2, str6, list3 != null ? np4.G(list3) : null);
                } else {
                    yhcVar = null;
                }
                licVar.e = 1;
                return yx6Var.emit(yhcVar, licVar) == obj2 ? obj2 : sbiVar;
            case 8:
                if (lq4Var instanceof knc) {
                    kncVar = (knc) lq4Var;
                    int i19 = kncVar.e;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        kncVar.e = i19 - Integer.MIN_VALUE;
                    } else {
                        kncVar = new knc(this, lq4Var);
                    }
                } else {
                    kncVar = new knc(this, lq4Var);
                }
                Object obj12 = kncVar.d;
                int i20 = kncVar.e;
                if (i20 != 0) {
                    if (i20 == 1) {
                        ch3.d0(obj12);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj12);
                if (!((dj4) obj).a.j()) {
                    return sbiVar;
                }
                kncVar.e = 1;
                return yx6Var.emit(obj, kncVar) == obj2 ? obj2 : sbiVar;
            case 9:
                if (lq4Var instanceof mnc) {
                    mncVar = (mnc) lq4Var;
                    int i21 = mncVar.e;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        mncVar.e = i21 - Integer.MIN_VALUE;
                    } else {
                        mncVar = new mnc(this, lq4Var);
                    }
                } else {
                    mncVar = new mnc(this, lq4Var);
                }
                Object obj13 = mncVar.d;
                int i22 = mncVar.e;
                if (i22 != 0) {
                    if (i22 == 1) {
                        ch3.d0(obj13);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj13);
                if (!(obj instanceof dj4)) {
                    return sbiVar;
                }
                mncVar.e = 1;
                return yx6Var.emit(obj, mncVar) == obj2 ? obj2 : sbiVar;
            case 10:
                if (lq4Var instanceof ewc) {
                    ewcVar = (ewc) lq4Var;
                    int i23 = ewcVar.e;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ewcVar.e = i23 - Integer.MIN_VALUE;
                    } else {
                        ewcVar = new ewc(this, lq4Var);
                    }
                } else {
                    ewcVar = new ewc(this, lq4Var);
                }
                Object obj14 = ewcVar.d;
                int i24 = ewcVar.e;
                if (i24 != 0) {
                    if (i24 == 1) {
                        ch3.d0(obj14);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj14);
                if (!(obj instanceof e16)) {
                    return sbiVar;
                }
                ewcVar.e = 1;
                return yx6Var.emit(obj, ewcVar) == obj2 ? obj2 : sbiVar;
            case 11:
                if (lq4Var instanceof jyc) {
                    jycVar = (jyc) lq4Var;
                    int i25 = jycVar.e;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        jycVar.e = i25 - Integer.MIN_VALUE;
                    } else {
                        jycVar = new jyc(this, lq4Var);
                    }
                } else {
                    jycVar = new jyc(this, lq4Var);
                }
                Object obj15 = jycVar.d;
                int i26 = jycVar.e;
                if (i26 != 0) {
                    if (i26 == 1) {
                        ch3.d0(obj15);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj15);
                if (((y47) obj) == y47.b) {
                    return sbiVar;
                }
                jycVar.e = 1;
                return yx6Var.emit(obj, jycVar) == obj2 ? obj2 : sbiVar;
            case 12:
                if (lq4Var instanceof nyc) {
                    nycVar = (nyc) lq4Var;
                    int i27 = nycVar.e;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        nycVar.e = i27 - Integer.MIN_VALUE;
                    } else {
                        nycVar = new nyc(this, lq4Var);
                    }
                } else {
                    nycVar = new nyc(this, lq4Var);
                }
                Object obj16 = nycVar.d;
                int i28 = nycVar.e;
                if (i28 == 0) {
                    ch3.d0(obj16);
                    Object objValueOf2 = Boolean.valueOf(!r5h.X0((String) obj));
                    nycVar.e = 1;
                    return yx6Var.emit(objValueOf2, nycVar) == obj2 ? obj2 : sbiVar;
                }
                if (i28 == 1) {
                    ch3.d0(obj16);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lq4Var instanceof h1d) {
                    h1dVar = (h1d) lq4Var;
                    int i29 = h1dVar.e;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        h1dVar.e = i29 - Integer.MIN_VALUE;
                    } else {
                        h1dVar = new h1d(this, lq4Var);
                    }
                } else {
                    h1dVar = new h1d(this, lq4Var);
                }
                Object obj17 = h1dVar.d;
                int i30 = h1dVar.e;
                if (i30 == 0) {
                    ch3.d0(obj17);
                    Object obj18 = ((l9) obj).e.a;
                    h1dVar.e = 1;
                    return yx6Var.emit(obj18, h1dVar) == obj2 ? obj2 : sbiVar;
                }
                if (i30 == 1) {
                    ch3.d0(obj17);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lq4Var instanceof r1d) {
                    r1dVar = (r1d) lq4Var;
                    int i31 = r1dVar.e;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        r1dVar.e = i31 - Integer.MIN_VALUE;
                    } else {
                        r1dVar = new r1d(this, lq4Var);
                    }
                } else {
                    r1dVar = new r1d(this, lq4Var);
                }
                Object obj19 = r1dVar.d;
                int i32 = r1dVar.e;
                if (i32 != 0) {
                    if (i32 == 1) {
                        ch3.d0(obj19);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj19);
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = ((List) obj).iterator();
                while (it3.hasNext()) {
                    String str7 = ((ef2) it3.next()).a;
                    try {
                        ff2VarA = ejl.a(str7, null, null);
                    } catch (Exception e) {
                        Log.w("PipePresenceSrc", "Failed to create CameraIdentifier for pipeId: " + str7, e);
                        ff2VarA = null;
                    }
                    if (ff2VarA != null) {
                        arrayList4.add(ff2VarA);
                    }
                    break;
                }
                r1dVar.e = 1;
                return yx6Var.emit(arrayList4, r1dVar) == obj2 ? obj2 : sbiVar;
            case 15:
                if (lq4Var instanceof i6d) {
                    i6dVar = (i6d) lq4Var;
                    int i33 = i6dVar.e;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        i6dVar.e = i33 - Integer.MIN_VALUE;
                    } else {
                        i6dVar = new i6d(this, lq4Var);
                    }
                } else {
                    i6dVar = new i6d(this, lq4Var);
                }
                Object obj20 = i6dVar.d;
                int i34 = i6dVar.e;
                if (i34 != 0) {
                    if (i34 == 1) {
                        ch3.d0(obj20);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj20);
                if (((Number) obj).intValue() <= 0) {
                    return sbiVar;
                }
                i6dVar.e = 1;
                return yx6Var.emit(obj, i6dVar) == obj2 ? obj2 : sbiVar;
            case 16:
                if (lq4Var instanceof k6d) {
                    k6dVar = (k6d) lq4Var;
                    int i35 = k6dVar.e;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        k6dVar.e = i35 - Integer.MIN_VALUE;
                    } else {
                        k6dVar = new k6d(this, lq4Var);
                    }
                } else {
                    k6dVar = new k6d(this, lq4Var);
                }
                Object obj21 = k6dVar.d;
                int i36 = k6dVar.e;
                if (i36 != 0) {
                    if (i36 == 1) {
                        ch3.d0(obj21);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj21);
                int iIntValue = ((Number) obj).intValue();
                Object rnhVar = new rnh(R.plurals.oneme_poll_result__vote_count, iIntValue, a.n1(new Object[]{new Integer(iIntValue)}));
                k6dVar.e = 1;
                return yx6Var.emit(rnhVar, k6dVar) == obj2 ? obj2 : sbiVar;
            case 17:
                if (lq4Var instanceof x7d) {
                    x7dVar = (x7d) lq4Var;
                    int i37 = x7dVar.e;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        x7dVar.e = i37 - Integer.MIN_VALUE;
                    } else {
                        x7dVar = new x7d(this, lq4Var);
                    }
                } else {
                    x7dVar = new x7d(this, lq4Var);
                }
                Object obj22 = x7dVar.d;
                int i38 = x7dVar.e;
                if (i38 != 0) {
                    if (i38 == 1) {
                        ch3.d0(obj22);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj22);
                x8d x8dVar = (x8d) obj;
                List list4 = x8dVar.a;
                ArrayList arrayList5 = new ArrayList(yw3.W0(list4, 10));
                for (Object obj23 : list4) {
                    int i39 = i2 + 1;
                    if (i2 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    l7d l7dVar = (l7d) obj23;
                    arrayList5.add(new l7d(l7dVar.d, l7dVar.a, i2 == 11 ? 6 : 5, l7dVar.c));
                    i2 = i39;
                }
                CharSequence charSequence = x8dVar.c;
                boolean z = x8dVar.b;
                c79 c79VarW = yab.w();
                c79VarW.add(new n7d(new tnh(R.string.oneme_poll_create__name_hint), new xnh(charSequence)));
                c79VarW.addAll(arrayList5);
                if (arrayList5.size() < 12) {
                    c79VarW.add(k7d.a);
                }
                tnh tnhVar = new tnh(R.string.oneme_poll_create__revote_setting_item);
                ksf ksfVar = new ksf(z, true);
                int i40 = z5c.d;
                c79VarW.add(new m7d(tnhVar, ksfVar));
                Object objJ2 = yab.j(c79VarW);
                x7dVar.e = 1;
                return yx6Var.emit(objJ2, x7dVar) == obj2 ? obj2 : sbiVar;
            case 18:
                if (lq4Var instanceof atd) {
                    atdVar = (atd) lq4Var;
                    int i41 = atdVar.e;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        atdVar.e = i41 - Integer.MIN_VALUE;
                    } else {
                        atdVar = new atd(this, lq4Var);
                    }
                } else {
                    atdVar = new atd(this, lq4Var);
                }
                Object obj24 = atdVar.d;
                int i42 = atdVar.e;
                if (i42 == 0) {
                    ch3.d0(obj24);
                    Object obj25 = ((ec6) obj).a;
                    atdVar.e = 1;
                    return yx6Var.emit(obj25, atdVar) == obj2 ? obj2 : sbiVar;
                }
                if (i42 == 1) {
                    ch3.d0(obj24);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lq4Var instanceof ftd) {
                    ftdVar = (ftd) lq4Var;
                    int i43 = ftdVar.e;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ftdVar.e = i43 - Integer.MIN_VALUE;
                    } else {
                        ftdVar = new ftd(this, lq4Var);
                    }
                } else {
                    ftdVar = new ftd(this, lq4Var);
                }
                Object obj26 = ftdVar.d;
                int i44 = ftdVar.e;
                if (i44 != 0) {
                    if (i44 == 1) {
                        ch3.d0(obj26);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj26);
                if (!(obj instanceof la3)) {
                    return sbiVar;
                }
                ftdVar.e = 1;
                return yx6Var.emit(obj, ftdVar) == obj2 ? obj2 : sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof gtd) {
                    gtdVar = (gtd) lq4Var;
                    int i45 = gtdVar.e;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        gtdVar.e = i45 - Integer.MIN_VALUE;
                    } else {
                        gtdVar = new gtd(this, lq4Var);
                    }
                } else {
                    gtdVar = new gtd(this, lq4Var);
                }
                Object obj27 = gtdVar.d;
                int i46 = gtdVar.e;
                if (i46 != 0) {
                    if (i46 == 1) {
                        ch3.d0(obj27);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj27);
                List list5 = ((la3) obj).c;
                List list6 = list5;
                if (list6 == null || list6.isEmpty()) {
                    spannableStringBuilder = "";
                } else {
                    spannableStringBuilder = new SpannableStringBuilder();
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        spannableStringBuilder.append((CharSequence) it4.next());
                    }
                }
                gtdVar.e = 1;
                return yx6Var.emit(spannableStringBuilder, gtdVar) == obj2 ? obj2 : sbiVar;
            case 21:
                if (lq4Var instanceof ytd) {
                    ytdVar = (ytd) lq4Var;
                    int i47 = ytdVar.e;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ytdVar.e = i47 - Integer.MIN_VALUE;
                    } else {
                        ytdVar = new ytd(this, lq4Var);
                    }
                } else {
                    ytdVar = new ytd(this, lq4Var);
                }
                Object obj28 = ytdVar.d;
                int i48 = ytdVar.e;
                if (i48 != 0) {
                    if (i48 == 1) {
                        ch3.d0(obj28);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj28);
                if (!(obj instanceof qud)) {
                    return sbiVar;
                }
                ytdVar.e = 1;
                return yx6Var.emit(obj, ytdVar) == obj2 ? obj2 : sbiVar;
            case 22:
                if (lq4Var instanceof myd) {
                    mydVar = (myd) lq4Var;
                    int i49 = mydVar.e;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        mydVar.e = i49 - Integer.MIN_VALUE;
                    } else {
                        mydVar = new myd(this, lq4Var);
                    }
                } else {
                    mydVar = new myd(this, lq4Var);
                }
                Object obj29 = mydVar.d;
                int i50 = mydVar.e;
                if (i50 != 0) {
                    if (i50 == 1) {
                        ch3.d0(obj29);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj29);
                int iIntValue2 = ((Number) obj).intValue();
                ghb ghbVar = ew5.b;
                lw5 lw5Var = lw5.HOURS;
                Object vnhVar = new vnh(R.string.oneme_stories_story_ttl_hours, a.n1(new Object[]{Long.valueOf(ew5.s(qe7.O(iIntValue2, lw5Var), lw5Var))}));
                mydVar.e = 1;
                return yx6Var.emit(vnhVar, mydVar) == obj2 ? obj2 : sbiVar;
            case 23:
                if (lq4Var instanceof u0e) {
                    u0eVar = (u0e) lq4Var;
                    int i51 = u0eVar.e;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        u0eVar.e = i51 - Integer.MIN_VALUE;
                    } else {
                        u0eVar = new u0e(this, lq4Var);
                    }
                } else {
                    u0eVar = new u0e(this, lq4Var);
                }
                Object obj30 = u0eVar.d;
                int i52 = u0eVar.e;
                if (i52 != 0) {
                    if (i52 == 1) {
                        ch3.d0(obj30);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj30);
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                u0eVar.e = 1;
                return yx6Var.emit(obj, u0eVar) == obj2 ? obj2 : sbiVar;
            case 24:
                if (lq4Var instanceof y7e) {
                    y7eVar = (y7e) lq4Var;
                    int i53 = y7eVar.e;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        y7eVar.e = i53 - Integer.MIN_VALUE;
                    } else {
                        y7eVar = new y7e(this, lq4Var);
                    }
                } else {
                    y7eVar = new y7e(this, lq4Var);
                }
                Object obj31 = y7eVar.d;
                int i54 = y7eVar.e;
                if (i54 == 0) {
                    ch3.d0(obj31);
                    Object obj32 = ((ec6) obj).a;
                    y7eVar.e = 1;
                    return yx6Var.emit(obj32, y7eVar) == obj2 ? obj2 : sbiVar;
                }
                if (i54 == 1) {
                    ch3.d0(obj31);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lq4Var instanceof pae) {
                    paeVar = (pae) lq4Var;
                    int i55 = paeVar.e;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        paeVar.e = i55 - Integer.MIN_VALUE;
                    } else {
                        paeVar = new pae(this, lq4Var);
                    }
                } else {
                    paeVar = new pae(this, lq4Var);
                }
                Object obj33 = paeVar.d;
                int i56 = paeVar.e;
                if (i56 == 0) {
                    ch3.d0(obj33);
                    Object objB = jae.b((List) obj);
                    paeVar.e = 1;
                    return yx6Var.emit(objB, paeVar) == obj2 ? obj2 : sbiVar;
                }
                if (i56 == 1) {
                    ch3.d0(obj33);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lq4Var instanceof rae) {
                    raeVar = (rae) lq4Var;
                    int i57 = raeVar.e;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        raeVar.e = i57 - Integer.MIN_VALUE;
                    } else {
                        raeVar = new rae(this, lq4Var);
                    }
                } else {
                    raeVar = new rae(this, lq4Var);
                }
                Object obj34 = raeVar.d;
                int i58 = raeVar.e;
                if (i58 == 0) {
                    ch3.d0(obj34);
                    Object objB2 = jae.b((List) obj);
                    raeVar.e = 1;
                    return yx6Var.emit(objB2, raeVar) == obj2 ? obj2 : sbiVar;
                }
                if (i58 == 1) {
                    ch3.d0(obj34);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lq4Var instanceof sae) {
                    saeVar = (sae) lq4Var;
                    int i59 = saeVar.e;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        saeVar.e = i59 - Integer.MIN_VALUE;
                    } else {
                        saeVar = new sae(this, lq4Var);
                    }
                } else {
                    saeVar = new sae(this, lq4Var);
                }
                Object obj35 = saeVar.d;
                int i60 = saeVar.e;
                if (i60 == 0) {
                    ch3.d0(obj35);
                    Object objB3 = jae.b((List) obj);
                    saeVar.e = 1;
                    return yx6Var.emit(objB3, saeVar) == obj2 ? obj2 : sbiVar;
                }
                if (i60 == 1) {
                    ch3.d0(obj35);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lq4Var instanceof uce) {
                    uceVar = (uce) lq4Var;
                    int i61 = uceVar.e;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        uceVar.e = i61 - Integer.MIN_VALUE;
                    } else {
                        uceVar = new uce(this, lq4Var);
                    }
                } else {
                    uceVar = new uce(this, lq4Var);
                }
                Object obj36 = uceVar.d;
                int i62 = uceVar.e;
                if (i62 == 0) {
                    ch3.d0(obj36);
                    Object objB4 = mxl.b(((Number) obj).longValue());
                    uceVar.e = 1;
                    return yx6Var.emit(objB4, uceVar) == obj2 ? obj2 : sbiVar;
                }
                if (i62 == 1) {
                    ch3.d0(obj36);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lq4Var instanceof gde) {
                    gdeVar = (gde) lq4Var;
                    int i63 = gdeVar.e;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        gdeVar.e = i63 - Integer.MIN_VALUE;
                    } else {
                        gdeVar = new gde(this, lq4Var);
                    }
                } else {
                    gdeVar = new gde(this, lq4Var);
                }
                Object obj37 = gdeVar.d;
                int i64 = gdeVar.e;
                if (i64 != 0) {
                    if (i64 == 1) {
                        ch3.d0(obj37);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj37);
                if (((t4f) obj).a == u4f.a) {
                    return sbiVar;
                }
                gdeVar.e = 1;
                return yx6Var.emit(obj, gdeVar) == obj2 ? obj2 : sbiVar;
        }
    }

    public /* synthetic */ t6b(yx6 yx6Var, a8j a8jVar, int i) {
        this.a = i;
        this.b = yx6Var;
    }
}
