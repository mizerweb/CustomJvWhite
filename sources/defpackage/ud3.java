package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* JADX INFO: loaded from: classes4.dex */
public final class ud3 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public /* synthetic */ ud3(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x018c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:156:0x0238  */
    /* JADX WARN: Code duplicated, block: B:171:0x0274  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:201:0x02da  */
    /* JADX WARN: Code duplicated, block: B:218:0x0312  */
    /* JADX WARN: Code duplicated, block: B:235:0x034f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0387  */
    /* JADX WARN: Code duplicated, block: B:265:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:280:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:317:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:332:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:349:0x0526  */
    /* JADX WARN: Code duplicated, block: B:366:0x0565  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:400:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:427:0x0646  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:445:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:460:0x06de  */
    /* JADX WARN: Code duplicated, block: B:477:0x0716  */
    /* JADX WARN: Code duplicated, block: B:512:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:527:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:548:0x0839  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
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
        td3 td3Var;
        yk3 yk3Var;
        o04 o04Var;
        l24 l24Var;
        t24 t24Var;
        ob4 ob4Var;
        pb4 pb4Var;
        tk4 tk4Var;
        zm4 zm4Var;
        q85 q85Var;
        s85 s85Var;
        v85 v85Var;
        w85 w85Var;
        ho5 ho5Var;
        up5 up5Var;
        hr5 hr5Var;
        iy5 iy5Var;
        ky5 ky5Var;
        l26 l26Var;
        n26 n26Var;
        sm6 sm6Var;
        ot6 ot6Var;
        iy6 iy6Var;
        f97 f97Var;
        h97 h97Var;
        cj7 cj7Var;
        gj7 gj7Var;
        ob8 ob8Var;
        pb8 pb8Var;
        bh8 bh8Var;
        int i = this.a;
        boolean z = false;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        Object obj2 = hu4.a;
        Object jgaVar = null;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof td3) {
                    td3Var = (td3) lq4Var;
                    int i2 = td3Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        td3Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        td3Var = new td3(this, lq4Var);
                    }
                } else {
                    td3Var = new td3(this, lq4Var);
                }
                Object obj3 = td3Var.d;
                int i3 = td3Var.e;
                if (i3 == 0) {
                    ch3.d0(obj3);
                    Object objValueOf = Boolean.valueOf(cqk.d((cj6) obj, cj6.a));
                    td3Var.e = 1;
                    return yx6Var.emit(objValueOf, td3Var) == obj2 ? obj2 : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj3);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lq4Var instanceof yk3) {
                    yk3Var = (yk3) lq4Var;
                    int i4 = yk3Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        yk3Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        yk3Var = new yk3(this, lq4Var);
                    }
                } else {
                    yk3Var = new yk3(this, lq4Var);
                }
                Object obj4 = yk3Var.d;
                int i5 = yk3Var.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj4);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj4);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : (List) obj) {
                    if (obj5 instanceof h9h) {
                        arrayList2.add(obj5);
                    }
                }
                yk3Var.e = 1;
                return yx6Var.emit(arrayList2, yk3Var) == obj2 ? obj2 : sbiVar;
            case 2:
                if (lq4Var instanceof o04) {
                    o04Var = (o04) lq4Var;
                    int i6 = o04Var.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        o04Var.e = i6 - Integer.MIN_VALUE;
                    } else {
                        o04Var = new o04(this, lq4Var);
                    }
                } else {
                    o04Var = new o04(this, lq4Var);
                }
                Object obj6 = o04Var.d;
                int i7 = o04Var.e;
                if (i7 == 0) {
                    ch3.d0(obj6);
                    Object num = new Integer(((rt2) obj).b.v0);
                    o04Var.e = 1;
                    return yx6Var.emit(num, o04Var) == obj2 ? obj2 : sbiVar;
                }
                if (i7 == 1) {
                    ch3.d0(obj6);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lq4Var instanceof l24) {
                    l24Var = (l24) lq4Var;
                    int i8 = l24Var.e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        l24Var.e = i8 - Integer.MIN_VALUE;
                    } else {
                        l24Var = new l24(this, lq4Var);
                    }
                } else {
                    l24Var = new l24(this, lq4Var);
                }
                Object obj7 = l24Var.d;
                int i9 = l24Var.e;
                if (i9 == 0) {
                    ch3.d0(obj7);
                    bz3 bz3Var = (bz3) obj;
                    if (bz3Var instanceof vy3) {
                        vy3 vy3Var = (vy3) bz3Var;
                        jgaVar = new iga(vy3Var.b, vy3Var.c, vy3Var.d);
                    } else if (bz3Var instanceof xy3) {
                        jgaVar = new lga(((xy3) bz3Var).b);
                    } else if (bz3Var instanceof yy3) {
                        yy3 yy3Var = (yy3) bz3Var;
                        jgaVar = new mga(yy3Var.b, yy3Var.c);
                    } else if (bz3Var instanceof az3) {
                        jgaVar = new rga(((az3) bz3Var).b);
                    } else if (bz3Var instanceof wy3) {
                        jgaVar = new jga();
                    } else if (!(bz3Var instanceof zy3)) {
                        ore.o();
                    }
                    if (jgaVar == null) {
                        return sbiVar;
                    }
                    l24Var.e = 1;
                    return yx6Var.emit(jgaVar, l24Var) == obj2 ? obj2 : sbiVar;
                }
                if (i9 == 1) {
                    ch3.d0(obj7);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lq4Var instanceof t24) {
                    t24Var = (t24) lq4Var;
                    int i10 = t24Var.e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        t24Var.e = i10 - Integer.MIN_VALUE;
                    } else {
                        t24Var = new t24(this, lq4Var);
                    }
                } else {
                    t24Var = new t24(this, lq4Var);
                }
                Object obj8 = t24Var.d;
                int i11 = t24Var.e;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ch3.d0(obj8);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj8);
                if (!(obj instanceof xy3)) {
                    return sbiVar;
                }
                t24Var.e = 1;
                return yx6Var.emit(obj, t24Var) == obj2 ? obj2 : sbiVar;
            case 5:
                if (lq4Var instanceof ob4) {
                    ob4Var = (ob4) lq4Var;
                    int i12 = ob4Var.e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        ob4Var.e = i12 - Integer.MIN_VALUE;
                    } else {
                        ob4Var = new ob4(this, lq4Var);
                    }
                } else {
                    ob4Var = new ob4(this, lq4Var);
                }
                Object obj9 = ob4Var.d;
                int i13 = ob4Var.e;
                if (i13 == 0) {
                    ch3.d0(obj9);
                    Object rbgVar = new rbg((ag9) obj);
                    ob4Var.e = 1;
                    return yx6Var.emit(rbgVar, ob4Var) == obj2 ? obj2 : sbiVar;
                }
                if (i13 == 1) {
                    ch3.d0(obj9);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lq4Var instanceof pb4) {
                    pb4Var = (pb4) lq4Var;
                    int i14 = pb4Var.e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        pb4Var.e = i14 - Integer.MIN_VALUE;
                    } else {
                        pb4Var = new pb4(this, lq4Var);
                    }
                } else {
                    pb4Var = new pb4(this, lq4Var);
                }
                Object obj10 = pb4Var.d;
                int i15 = pb4Var.e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ch3.d0(obj10);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj10);
                long jLongValue = ((Number) obj).longValue();
                Object obj11 = jLongValue != 0 ? String.format("%01d:%02d", Arrays.copyOf(new Object[]{new Long(jLongValue / 60), new Long(jLongValue % 60)}, 2)) : null;
                pb4Var.e = 1;
                return yx6Var.emit(obj11, pb4Var) == obj2 ? obj2 : sbiVar;
            case 7:
                if (lq4Var instanceof tk4) {
                    tk4Var = (tk4) lq4Var;
                    int i16 = tk4Var.e;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        tk4Var.e = i16 - Integer.MIN_VALUE;
                    } else {
                        tk4Var = new tk4(this, lq4Var);
                    }
                } else {
                    tk4Var = new tk4(this, lq4Var);
                }
                Object obj12 = tk4Var.d;
                int i17 = tk4Var.e;
                if (i17 != 0) {
                    if (i17 == 1) {
                        ch3.d0(obj12);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj12);
                vj4 vj4Var = (vj4) obj;
                List<ek4> list = vj4Var.a;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (ek4 ek4Var : list) {
                        ek4 ek4VarI = ek4Var.q ? null : ek4.i(ek4Var, null, false, 2088959);
                        if (ek4VarI != null) {
                            arrayList3.add(ek4VarI);
                        }
                    }
                    arrayList = arrayList3;
                }
                Object objA = vj4.a(vj4Var, arrayList, 2);
                tk4Var.e = 1;
                return yx6Var.emit(objA, tk4Var) == obj2 ? obj2 : sbiVar;
            case 8:
                if (lq4Var instanceof zm4) {
                    zm4Var = (zm4) lq4Var;
                    int i18 = zm4Var.e;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        zm4Var.e = i18 - Integer.MIN_VALUE;
                    } else {
                        zm4Var = new zm4(this, lq4Var);
                    }
                } else {
                    zm4Var = new zm4(this, lq4Var);
                }
                Object obj13 = zm4Var.d;
                int i19 = zm4Var.e;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ch3.d0(obj13);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj13);
                if (((vj4) obj).b()) {
                    return sbiVar;
                }
                zm4Var.e = 1;
                return yx6Var.emit(obj, zm4Var) == obj2 ? obj2 : sbiVar;
            case 9:
                if (lq4Var instanceof q85) {
                    q85Var = (q85) lq4Var;
                    int i20 = q85Var.e;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        q85Var.e = i20 - Integer.MIN_VALUE;
                    } else {
                        q85Var = new q85(this, lq4Var);
                    }
                } else {
                    q85Var = new q85(this, lq4Var);
                }
                Object obj14 = q85Var.d;
                int i21 = q85Var.e;
                if (i21 != 0) {
                    if (i21 == 1) {
                        ch3.d0(obj14);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj14);
                if (!(((lh1) obj) instanceof fh1)) {
                    return sbiVar;
                }
                q85Var.e = 1;
                return yx6Var.emit(obj, q85Var) == obj2 ? obj2 : sbiVar;
            case 10:
                if (lq4Var instanceof s85) {
                    s85Var = (s85) lq4Var;
                    int i22 = s85Var.e;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        s85Var.e = i22 - Integer.MIN_VALUE;
                    } else {
                        s85Var = new s85(this, lq4Var);
                    }
                } else {
                    s85Var = new s85(this, lq4Var);
                }
                Object obj15 = s85Var.d;
                int i23 = s85Var.e;
                if (i23 != 0) {
                    if (i23 == 1) {
                        ch3.d0(obj15);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj15);
                if (cqk.d((be1) obj, be1.n)) {
                    return sbiVar;
                }
                s85Var.e = 1;
                return yx6Var.emit(obj, s85Var) == obj2 ? obj2 : sbiVar;
            case 11:
                if (lq4Var instanceof v85) {
                    v85Var = (v85) lq4Var;
                    int i24 = v85Var.e;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        v85Var.e = i24 - Integer.MIN_VALUE;
                    } else {
                        v85Var = new v85(this, lq4Var);
                    }
                } else {
                    v85Var = new v85(this, lq4Var);
                }
                Object obj16 = v85Var.d;
                int i25 = v85Var.e;
                if (i25 != 0) {
                    if (i25 == 1) {
                        ch3.d0(obj16);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj16);
                if (((tmc) obj).a.u() != 3) {
                    return sbiVar;
                }
                v85Var.e = 1;
                return yx6Var.emit(obj, v85Var) == obj2 ? obj2 : sbiVar;
            case 12:
                if (lq4Var instanceof w85) {
                    w85Var = (w85) lq4Var;
                    int i26 = w85Var.e;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        w85Var.e = i26 - Integer.MIN_VALUE;
                    } else {
                        w85Var = new w85(this, lq4Var);
                    }
                } else {
                    w85Var = new w85(this, lq4Var);
                }
                Object obj17 = w85Var.d;
                int i27 = w85Var.e;
                if (i27 == 0) {
                    ch3.d0(obj17);
                    Object obj18 = ((enc) obj).a;
                    w85Var.e = 1;
                    return yx6Var.emit(obj18, w85Var) == obj2 ? obj2 : sbiVar;
                }
                if (i27 == 1) {
                    ch3.d0(obj17);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lq4Var instanceof ho5) {
                    ho5Var = (ho5) lq4Var;
                    int i28 = ho5Var.e;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        ho5Var.e = i28 - Integer.MIN_VALUE;
                    } else {
                        ho5Var = new ho5(this, lq4Var);
                    }
                } else {
                    ho5Var = new ho5(this, lq4Var);
                }
                Object obj19 = ho5Var.d;
                int i29 = ho5Var.e;
                if (i29 == 0) {
                    ch3.d0(obj19);
                    ArrayList<go5> arrayList4 = new ArrayList();
                    for (Object obj20 : (Collection) obj) {
                        go5 go5Var = (go5) obj20;
                        if (go5Var.b > 0 && go5Var.c > 0) {
                            arrayList4.add(obj20);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(yw3.W0(arrayList4, 10));
                    for (go5 go5Var2 : arrayList4) {
                        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = go5Var2.a;
                        td0 td0Var = new td0(6);
                        td0Var.d = 1;
                        td0Var.b = go5Var2.b;
                        td0Var.c = go5Var2.c;
                        td0Var.d = conversationVideoTrackParticipantKey.getType() == v4j.b ? 2 : 1;
                        if (td0Var.b <= 0 || td0Var.c <= 0) {
                            ore.p("width and height must be positive");
                        } else {
                            arrayList5.add(new ConversationDisplayLayoutItem(conversationVideoTrackParticipantKey, new yvi(td0Var)));
                        }
                    }
                    ho5Var.e = 1;
                    return yx6Var.emit(arrayList5, ho5Var) == obj2 ? obj2 : sbiVar;
                }
                if (i29 == 1) {
                    ch3.d0(obj19);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lq4Var instanceof up5) {
                    up5Var = (up5) lq4Var;
                    int i30 = up5Var.e;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        up5Var.e = i30 - Integer.MIN_VALUE;
                    } else {
                        up5Var = new up5(this, lq4Var);
                    }
                } else {
                    up5Var = new up5(this, lq4Var);
                }
                Object obj21 = up5Var.d;
                int i31 = up5Var.e;
                if (i31 == 0) {
                    ch3.d0(obj21);
                    Object objT1 = ww3.t1((List) obj);
                    up5Var.e = 1;
                    return yx6Var.emit(objT1, up5Var) == obj2 ? obj2 : sbiVar;
                }
                if (i31 == 1) {
                    ch3.d0(obj21);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lq4Var instanceof hr5) {
                    hr5Var = (hr5) lq4Var;
                    int i32 = hr5Var.e;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        hr5Var.e = i32 - Integer.MIN_VALUE;
                    } else {
                        hr5Var = new hr5(this, lq4Var);
                    }
                } else {
                    hr5Var = new hr5(this, lq4Var);
                }
                Object obj22 = hr5Var.d;
                int i33 = hr5Var.e;
                if (i33 == 0) {
                    ch3.d0(obj22);
                    Object objT2 = ww3.t1((List) obj);
                    hr5Var.e = 1;
                    return yx6Var.emit(objT2, hr5Var) == obj2 ? obj2 : sbiVar;
                }
                if (i33 == 1) {
                    ch3.d0(obj22);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lq4Var instanceof iy5) {
                    iy5Var = (iy5) lq4Var;
                    int i34 = iy5Var.e;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        iy5Var.e = i34 - Integer.MIN_VALUE;
                    } else {
                        iy5Var = new iy5(this, lq4Var);
                    }
                } else {
                    iy5Var = new iy5(this, lq4Var);
                }
                Object obj23 = iy5Var.d;
                int i35 = iy5Var.e;
                if (i35 == 0) {
                    ch3.d0(obj23);
                    Object obj24 = ((ec6) obj).a;
                    iy5Var.e = 1;
                    return yx6Var.emit(obj24, iy5Var) == obj2 ? obj2 : sbiVar;
                }
                if (i35 == 1) {
                    ch3.d0(obj23);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lq4Var instanceof ky5) {
                    ky5Var = (ky5) lq4Var;
                    int i36 = ky5Var.e;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ky5Var.e = i36 - Integer.MIN_VALUE;
                    } else {
                        ky5Var = new ky5(this, lq4Var);
                    }
                } else {
                    ky5Var = new ky5(this, lq4Var);
                }
                Object obj25 = ky5Var.d;
                int i37 = ky5Var.e;
                if (i37 != 0) {
                    if (i37 == 1) {
                        ch3.d0(obj25);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj25);
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                ky5Var.e = 1;
                return yx6Var.emit(obj, ky5Var) == obj2 ? obj2 : sbiVar;
            case 18:
                if (lq4Var instanceof l26) {
                    l26Var = (l26) lq4Var;
                    int i38 = l26Var.e;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        l26Var.e = i38 - Integer.MIN_VALUE;
                    } else {
                        l26Var = new l26(this, lq4Var);
                    }
                } else {
                    l26Var = new l26(this, lq4Var);
                }
                Object obj26 = l26Var.d;
                int i39 = l26Var.e;
                if (i39 != 0) {
                    if (i39 == 1) {
                        ch3.d0(obj26);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj26);
                if (!(obj instanceof s16)) {
                    return sbiVar;
                }
                l26Var.e = 1;
                return yx6Var.emit(obj, l26Var) == obj2 ? obj2 : sbiVar;
            case 19:
                if (lq4Var instanceof n26) {
                    n26Var = (n26) lq4Var;
                    int i40 = n26Var.e;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        n26Var.e = i40 - Integer.MIN_VALUE;
                    } else {
                        n26Var = new n26(this, lq4Var);
                    }
                } else {
                    n26Var = new n26(this, lq4Var);
                }
                Object obj27 = n26Var.d;
                int i41 = n26Var.e;
                if (i41 == 0) {
                    ch3.d0(obj27);
                    f16 f16Var = (f16) obj;
                    if (cqk.d(f16Var, c16.a) || cqk.d(f16Var, d16.a)) {
                        z = true;
                    } else if (f16Var instanceof e16) {
                        e16 e16Var = (e16) f16Var;
                        if (e16Var.a.l == jb9.d) {
                            fvi fviVar = e16Var.b;
                            if (fviVar != null) {
                                z = fviVar.e;
                            }
                        } else {
                            z = true;
                        }
                    } else {
                        ore.o();
                    }
                    Object objValueOf2 = Boolean.valueOf(z);
                    n26Var.e = 1;
                    return yx6Var.emit(objValueOf2, n26Var) == obj2 ? obj2 : sbiVar;
                }
                if (i41 == 1) {
                    ch3.d0(obj27);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof sm6) {
                    sm6Var = (sm6) lq4Var;
                    int i42 = sm6Var.e;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        sm6Var.e = i42 - Integer.MIN_VALUE;
                    } else {
                        sm6Var = new sm6(this, lq4Var);
                    }
                } else {
                    sm6Var = new sm6(this, lq4Var);
                }
                Object obj28 = sm6Var.d;
                int i43 = sm6Var.e;
                if (i43 == 0) {
                    ch3.d0(obj28);
                    Object objT3 = ww3.T1((List) obj);
                    sm6Var.e = 1;
                    return yx6Var.emit(objT3, sm6Var) == obj2 ? obj2 : sbiVar;
                }
                if (i43 == 1) {
                    ch3.d0(obj28);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lq4Var instanceof ot6) {
                    ot6Var = (ot6) lq4Var;
                    int i44 = ot6Var.e;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        ot6Var.e = i44 - Integer.MIN_VALUE;
                    } else {
                        ot6Var = new ot6(this, lq4Var);
                    }
                } else {
                    ot6Var = new ot6(this, lq4Var);
                }
                Object obj29 = ot6Var.d;
                int i45 = ot6Var.e;
                if (i45 != 0) {
                    if (i45 == 1) {
                        ch3.d0(obj29);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj29);
                Object obj30 = ((roe) obj).a;
                ch3.d0(obj30);
                ot6Var.e = 1;
                return yx6Var.emit(obj30, ot6Var) == obj2 ? obj2 : sbiVar;
            case 22:
                if (lq4Var instanceof iy6) {
                    iy6Var = (iy6) lq4Var;
                    int i46 = iy6Var.e;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        iy6Var.e = i46 - Integer.MIN_VALUE;
                    } else {
                        iy6Var = new iy6(this, lq4Var);
                    }
                } else {
                    iy6Var = new iy6(this, lq4Var);
                }
                Object obj31 = iy6Var.d;
                int i47 = iy6Var.e;
                if (i47 == 0) {
                    ch3.d0(obj31);
                    Object roeVar = new roe(obj);
                    iy6Var.e = 1;
                    return yx6Var.emit(roeVar, iy6Var) == obj2 ? obj2 : sbiVar;
                }
                if (i47 == 1) {
                    ch3.d0(obj31);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lq4Var instanceof f97) {
                    f97Var = (f97) lq4Var;
                    int i48 = f97Var.e;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        f97Var.e = i48 - Integer.MIN_VALUE;
                    } else {
                        f97Var = new f97(this, lq4Var);
                    }
                } else {
                    f97Var = new f97(this, lq4Var);
                }
                Object obj32 = f97Var.d;
                int i49 = f97Var.e;
                if (i49 == 0) {
                    ch3.d0(obj32);
                    Object obj33 = ((ec6) obj).a;
                    f97Var.e = 1;
                    return yx6Var.emit(obj33, f97Var) == obj2 ? obj2 : sbiVar;
                }
                if (i49 == 1) {
                    ch3.d0(obj32);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lq4Var instanceof h97) {
                    h97Var = (h97) lq4Var;
                    int i50 = h97Var.e;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        h97Var.e = i50 - Integer.MIN_VALUE;
                    } else {
                        h97Var = new h97(this, lq4Var);
                    }
                } else {
                    h97Var = new h97(this, lq4Var);
                }
                Object obj34 = h97Var.d;
                int i51 = h97Var.e;
                if (i51 != 0) {
                    if (i51 == 1) {
                        ch3.d0(obj34);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj34);
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                h97Var.e = 1;
                return yx6Var.emit(obj, h97Var) == obj2 ? obj2 : sbiVar;
            case 25:
                if (lq4Var instanceof cj7) {
                    cj7Var = (cj7) lq4Var;
                    int i52 = cj7Var.e;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        cj7Var.e = i52 - Integer.MIN_VALUE;
                    } else {
                        cj7Var = new cj7(this, lq4Var);
                    }
                } else {
                    cj7Var = new cj7(this, lq4Var);
                }
                Object obj35 = cj7Var.d;
                int i53 = cj7Var.e;
                if (i53 != 0) {
                    if (i53 == 1) {
                        ch3.d0(obj35);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj35);
                if (((List) obj).isEmpty()) {
                    return sbiVar;
                }
                cj7Var.e = 1;
                return yx6Var.emit(obj, cj7Var) == obj2 ? obj2 : sbiVar;
            case 26:
                if (lq4Var instanceof gj7) {
                    gj7Var = (gj7) lq4Var;
                    int i54 = gj7Var.e;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        gj7Var.e = i54 - Integer.MIN_VALUE;
                    } else {
                        gj7Var = new gj7(this, lq4Var);
                    }
                } else {
                    gj7Var = new gj7(this, lq4Var);
                }
                Object obj36 = gj7Var.d;
                int i55 = gj7Var.e;
                if (i55 != 0) {
                    if (i55 == 1) {
                        ch3.d0(obj36);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj36);
                hef hefVar = (hef) obj;
                hefVar.getClass();
                if (hefVar != hef.b) {
                    return sbiVar;
                }
                gj7Var.e = 1;
                return yx6Var.emit(obj, gj7Var) == obj2 ? obj2 : sbiVar;
            case 27:
                if (lq4Var instanceof ob8) {
                    ob8Var = (ob8) lq4Var;
                    int i56 = ob8Var.e;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        ob8Var.e = i56 - Integer.MIN_VALUE;
                    } else {
                        ob8Var = new ob8(this, lq4Var);
                    }
                } else {
                    ob8Var = new ob8(this, lq4Var);
                }
                Object obj37 = ob8Var.d;
                int i57 = ob8Var.e;
                if (i57 != 0) {
                    if (i57 == 1) {
                        ch3.d0(obj37);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj37);
                if (!((nh7) obj).c) {
                    return sbiVar;
                }
                ob8Var.e = 1;
                return yx6Var.emit(obj, ob8Var) == obj2 ? obj2 : sbiVar;
            case 28:
                if (lq4Var instanceof pb8) {
                    pb8Var = (pb8) lq4Var;
                    int i58 = pb8Var.e;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        pb8Var.e = i58 - Integer.MIN_VALUE;
                    } else {
                        pb8Var = new pb8(this, lq4Var);
                    }
                } else {
                    pb8Var = new pb8(this, lq4Var);
                }
                Object obj38 = pb8Var.d;
                int i59 = pb8Var.e;
                if (i59 != 0) {
                    if (i59 == 1) {
                        ch3.d0(obj38);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj38);
                if (!((nh7) obj).c) {
                    return sbiVar;
                }
                pb8Var.e = 1;
                return yx6Var.emit(obj, pb8Var) == obj2 ? obj2 : sbiVar;
            default:
                if (lq4Var instanceof bh8) {
                    bh8Var = (bh8) lq4Var;
                    int i60 = bh8Var.e;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        bh8Var.e = i60 - Integer.MIN_VALUE;
                    } else {
                        bh8Var = new bh8(this, lq4Var);
                    }
                } else {
                    bh8Var = new bh8(this, lq4Var);
                }
                Object obj39 = bh8Var.d;
                int i61 = bh8Var.e;
                if (i61 != 0) {
                    if (i61 == 1) {
                        ch3.d0(obj39);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj39);
                if (!(obj instanceof xg8)) {
                    return sbiVar;
                }
                bh8Var.e = 1;
                return yx6Var.emit(obj, bh8Var) == obj2 ? obj2 : sbiVar;
        }
    }

    public /* synthetic */ ud3(yx6 yx6Var, Object obj, int i) {
        this.a = i;
        this.b = yx6Var;
    }
}
