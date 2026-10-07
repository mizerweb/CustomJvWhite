package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.contactadddialog.ContactAddBottomSheet;
import one.me.devmenu.DevMenuGeneralPageScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes2.dex */
public final class ke3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke3(Object obj, lq4 lq4Var, tnh tnhVar) {
        super(2, lq4Var);
        this.e = 13;
        this.f = obj;
        this.g = tnhVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0182  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj) {
        Object poeVar;
        String string;
        String string2;
        je9 je9Var = je9.f;
        ch3.d0(obj);
        String path = ((Uri) this.f).getPath();
        boolean z = false;
        if (path == 0) {
            String str = ((iz5) this.g).d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "File is not deleted as path is null", null);
            }
        } else {
            File file = new File(path);
            try {
                poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Object obj2 = Boolean.FALSE;
            if (poeVar instanceof poe) {
                poeVar = obj2;
            }
            boolean zBooleanValue = ((Boolean) poeVar).booleanValue();
            iz5 iz5Var = (iz5) this.g;
            String strK = "***";
            if (zBooleanValue) {
                String str2 = iz5Var.d;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        if (gm0.c()) {
                            string2 = path.toString();
                        } else {
                            if (path instanceof Collection) {
                                Collection collection = (Collection) path;
                                if (collection.isEmpty()) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(collection.size(), "[**", "**]");
                                }
                            } else if (path instanceof Map) {
                                Map map = (Map) path;
                                strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                            } else if (path instanceof Object[]) {
                                Object[] objArr = (Object[]) path;
                                if (objArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(objArr.length, "[**", "**]");
                                }
                            } else if (path instanceof int[]) {
                                int[] iArr = (int[]) path;
                                if (iArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(iArr.length, "[**", "**]");
                                }
                            } else if (path instanceof float[]) {
                                float[] fArr = (float[]) path;
                                if (fArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(fArr.length, "[**", "**]");
                                }
                            } else if (path instanceof long[]) {
                                long[] jArr = (long[]) path;
                                if (jArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(jArr.length, "[**", "**]");
                                }
                            } else if (path instanceof double[]) {
                                double[] dArr = (double[]) path;
                                if (dArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(dArr.length, "[**", "**]");
                                }
                            } else if (path instanceof short[]) {
                                short[] sArr = (short[]) path;
                                if (sArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(sArr.length, "[**", "**]");
                                }
                            } else if (path instanceof byte[]) {
                                byte[] bArr = (byte[]) path;
                                if (bArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(bArr.length, "[**", "**]");
                                }
                            } else if (path instanceof char[]) {
                                char[] cArr = (char[]) path;
                                if (cArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(cArr.length, "[**", "**]");
                                }
                            } else if (path instanceof boolean[]) {
                                boolean[] zArr = (boolean[]) path;
                                if (zArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(zArr.length, "[**", "**]");
                                }
                            }
                            string2 = strK;
                        }
                        a4cVar2.c(je9Var2, str2, c0a.o("File ", string2, " is deleted"), null);
                    }
                }
                z = true;
            } else {
                String str3 = iz5Var.d;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    if (gm0.c()) {
                        string = path.toString();
                    } else {
                        if (path instanceof Collection) {
                            Collection collection2 = (Collection) path;
                            if (collection2.isEmpty()) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(collection2.size(), "[**", "**]");
                            }
                        } else if (path instanceof Map) {
                            Map map2 = (Map) path;
                            strK = map2.isEmpty() ? "{}" : c0a.k(map2.size(), "{**", "**}");
                        } else if (path instanceof Object[]) {
                            Object[] objArr2 = (Object[]) path;
                            if (objArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(objArr2.length, "[**", "**]");
                            }
                        } else if (path instanceof int[]) {
                            int[] iArr2 = (int[]) path;
                            if (iArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(iArr2.length, "[**", "**]");
                            }
                        } else if (path instanceof float[]) {
                            float[] fArr2 = (float[]) path;
                            if (fArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(fArr2.length, "[**", "**]");
                            }
                        } else if (path instanceof long[]) {
                            long[] jArr2 = (long[]) path;
                            if (jArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(jArr2.length, "[**", "**]");
                            }
                        } else if (path instanceof double[]) {
                            double[] dArr2 = (double[]) path;
                            if (dArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(dArr2.length, "[**", "**]");
                            }
                        } else if (path instanceof short[]) {
                            short[] sArr2 = (short[]) path;
                            if (sArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(sArr2.length, "[**", "**]");
                            }
                        } else if (path instanceof byte[]) {
                            byte[] bArr2 = (byte[]) path;
                            if (bArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(bArr2.length, "[**", "**]");
                            }
                        } else if (path instanceof char[]) {
                            char[] cArr2 = (char[]) path;
                            if (cArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(cArr2.length, "[**", "**]");
                            }
                        } else if (path instanceof boolean[]) {
                            boolean[] zArr2 = (boolean[]) path;
                            if (zArr2.length == 0) {
                                strK = "[]";
                            } else {
                                strK = c0a.k(zArr2.length, "[**", "**]");
                            }
                        }
                        string = strK;
                    }
                    a4cVar3.c(je9Var, str3, c0a.o("File ", string, " is not deleted"), null);
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    private final Object n(Object obj) throws Throwable {
        int i;
        Throwable th;
        Throwable th2;
        ArrayList<bo2> arrayList;
        jl jlVarH;
        Object next;
        e5i e5iVar = (e5i) this.f;
        ch3.d0(obj);
        List list = (List) e5iVar.a;
        List list2 = (List) e5iVar.b;
        List list3 = (List) e5iVar.c;
        d66 d66Var = (d66) this.g;
        zv8[] zv8VarArr = d66.n;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            i = 0;
            th = null;
            z46VarB = null;
            z46VarB = null;
            z46 z46VarB = null;
            if (!it.hasNext()) {
                break;
            }
            eae eaeVar = (eae) it.next();
            mae maeVar = eaeVar.a;
            if (maeVar == mae.EMOJI && (eaeVar instanceof e56)) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!cqk.d(((z46) next).c, ((e56) eaeVar).c));
                z46 z46Var = (z46) next;
                if (z46Var != null) {
                    d46 d46Var = d46.CLASSIC;
                    z46VarB = z46.i(z46Var, -z46Var.b, false, 124);
                }
            } else if (maeVar == mae.ANIMOJI && (jlVarH = ((xm) d66Var.h.getValue()).h(eaeVar.b)) != null) {
                d46 d46Var2 = d46.CLASSIC;
                z46VarB = d66Var.B(list, jlVarH, -1, 0);
            }
            if (z46VarB != null) {
                arrayList2.add(z46VarB);
            }
        }
        String name = d66.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, qt4.l("Load emoji. Finish. emojis:", list.size(), list2.size(), ", recent:"), null);
            }
        }
        d66 d66Var2 = (d66) this.g;
        mjg mjgVar = d66Var2.i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Integer numValueOf = Integer.valueOf(((z46) obj2).a);
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            th2 = th;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list4 = (List) entry.getValue();
            d46 d46Var3 = d46.CLASSIC;
            d46 d46VarC = qvl.c(((Number) entry.getKey()).intValue());
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            arrayList4.add(new bo2(iIntValue, list4, !(arrayList2.isEmpty() && list3.isEmpty() && ((c66) mjgVar.getValue()).a == Integer.MIN_VALUE) ? ((c66) mjgVar.getValue()).a != ((Number) entry.getKey()).intValue() : ((Number) entry.getKey()).intValue() != 0, d46VarC, (String) null, (String) null, (xnh) null, iIntValue2 == -1 ? Long.MIN_VALUE : ((long) iIntValue2) - Long.MAX_VALUE, 496));
            th = th2;
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        if (!list3.isEmpty()) {
            int i2 = 0;
            for (Iterator it4 = list3.iterator(); it4.hasNext(); it4 = it4) {
                Object next2 = it4.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    xw3.V0();
                    throw th2;
                }
                bn bnVar = (bn) next2;
                boolean zIsEmpty = arrayList2.isEmpty();
                ArrayList arrayList6 = new ArrayList();
                d46 d46Var4 = d46.CLASSIC;
                int i4 = 9 + i2;
                int size = bnVar.d.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList6.add(d66Var2.B(list, (jl) bnVar.d.get(i5), i4, i5));
                }
                arrayList5.add(0, new bo2(i4, arrayList6, !(zIsEmpty && ((c66) mjgVar.getValue()).a == Integer.MIN_VALUE) ? ((c66) mjgVar.getValue()).a != i4 : i2 != 0, d46.ANIMOJI, bnVar.b, bnVar.c, new xnh(bnVar.a), i4 == -1 ? Long.MIN_VALUE : ((long) i4) - Long.MAX_VALUE, 384));
                i = 0;
                list = list;
                i2 = i3;
            }
        }
        int i6 = i;
        if (arrayList2.isEmpty()) {
            arrayList = arrayList5;
        } else {
            d46 d46Var5 = d46.CLASSIC;
            arrayList = arrayList5;
            arrayList.add(i6, new bo2(-1, (List) arrayList2, (((c66) mjgVar.getValue()).a != Integer.MIN_VALUE ? 1 : i6) ^ 1, qvl.c(-1), (String) null, (String) null, (xnh) null, Long.MIN_VALUE, 496));
        }
        c79 c79VarW = yab.w();
        for (bo2 bo2Var : arrayList) {
            c79VarW.add(bo2Var);
            c79VarW.addAll(bo2Var.b);
        }
        b66 b66Var = new b66(arrayList, yab.j(c79VarW));
        mjg mjgVar2 = ((d66) this.g).l;
        mjgVar2.getClass();
        mjgVar2.j(th2, b66Var);
        return sbi.a;
    }

    private final Object o(Object obj) {
        boolean z;
        je9 je9Var = je9.g;
        Throwable th = (Throwable) this.f;
        ch3.d0(obj);
        if ((th instanceof TamErrorException) && p90.C(((TamErrorException) th).a.b)) {
            String str = ((aj6) this.g).e;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, x05.h("ExternalCallback request failed with ", ". Retrying", th), null);
            }
            z = true;
        } else {
            String str2 = ((aj6) this.g).e;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, x05.h("ExternalCallback request failed with ", ". Couldn't recover", th), null);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ke3 ke3Var = new ke3(0, lq4Var, (ChatStatusBottomWidget) obj2);
                ke3Var.f = obj;
                return ke3Var;
            case 1:
                ke3 ke3Var2 = new ke3((se3) obj2, lq4Var, 1);
                ke3Var2.f = obj;
                return ke3Var2;
            case 2:
                ke3 ke3Var3 = new ke3((fk3) obj2, lq4Var, 2);
                ke3Var3.f = obj;
                return ke3Var3;
            case 3:
                return new ke3((rl3) this.f, (c39) obj2, lq4Var, 3);
            case 4:
                ke3 ke3Var4 = new ke3((pq3) obj2, lq4Var, 4);
                ke3Var4.f = obj;
                return ke3Var4;
            case 5:
                ke3 ke3Var5 = new ke3((tz3) obj2, lq4Var, 5);
                ke3Var5.f = obj;
                return ke3Var5;
            case 6:
                ke3 ke3Var6 = new ke3((q04) obj2, lq4Var, 6);
                ke3Var6.f = obj;
                return ke3Var6;
            case 7:
                ke3 ke3Var7 = new ke3((u24) obj2, lq4Var, 7);
                ke3Var7.f = obj;
                return ke3Var7;
            case 8:
                ke3 ke3Var8 = new ke3(8, lq4Var, (ConfirmAddOpponentToCallBottomSheet) obj2);
                ke3Var8.f = obj;
                return ke3Var8;
            case 9:
                ke3 ke3Var9 = new ke3(9, lq4Var, (ContactAddBottomSheet) obj2);
                ke3Var9.f = obj;
                return ke3Var9;
            case 10:
                return new ke3((xh4) this.f, (String) obj2, lq4Var, 10);
            case 11:
                ke3 ke3Var10 = new ke3((vi4) obj2, lq4Var, 11);
                ke3Var10.f = obj;
                return ke3Var10;
            case 12:
                return new ke3((vi4) this.f, (kni) obj2, lq4Var, 12);
            case 13:
                return new ke3(this.f, lq4Var, (tnh) obj2);
            case 14:
                ke3 ke3Var11 = new ke3(14, lq4Var, (ContactsPickerScreen) obj2);
                ke3Var11.f = obj;
                return ke3Var11;
            case 15:
                return new ke3((cf7) this.f, (Bitmap) obj2, lq4Var, 15);
            case 16:
                return new ke3((y85) this.f, (kgl) obj2, lq4Var, 16);
            case 17:
                ke3 ke3Var12 = new ke3((y85) obj2, lq4Var, 17);
                ke3Var12.f = obj;
                return ke3Var12;
            case 18:
                return new ke3((rc5) this.f, (yib) obj2, lq4Var, 18);
            case 19:
                return new ke3((rc5) this.f, (qjb) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ke3((rc5) this.f, (sjb) obj2, lq4Var, 20);
            case 21:
                return new ke3((rc5) this.f, (zkb) obj2, lq4Var, 21);
            case 22:
                ke3 ke3Var13 = new ke3((DevMenuGeneralPageScreen) obj2, lq4Var, 22);
                ke3Var13.f = obj;
                return ke3Var13;
            case 23:
                ke3 ke3Var14 = new ke3(23, lq4Var, (DialogNotificationsSettingsScreen) obj2);
                ke3Var14.f = obj;
                return ke3Var14;
            case 24:
                return new ke3((Uri) this.f, (iz5) obj2, lq4Var, 24);
            case 25:
                ke3 ke3Var15 = new ke3((zz5) obj2, lq4Var, 25);
                ke3Var15.f = obj;
                return ke3Var15;
            case 26:
                return new ke3((d66) this.f, (ny8) obj2, lq4Var, 26);
            case 27:
                ke3 ke3Var16 = new ke3((d66) obj2, lq4Var, 27);
                ke3Var16.f = obj;
                return ke3Var16;
            case 28:
                ke3 ke3Var17 = new ke3((aj6) obj2, lq4Var, 28);
                ke3Var17.f = obj;
                return ke3Var17;
            default:
                ke3 ke3Var18 = new ke3(29, lq4Var, (ExternalCallbackWidget) obj2);
                ke3Var18.f = obj;
                return ke3Var18;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((ke3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((ke3) create((e5i) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((ke3) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((ke3) create((sga) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((ke3) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((ke3) create((xy3) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((ke3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((ke3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((ke3) create((pz5) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                return ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                ((ke3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                return ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((ke3) create((be1) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ((ke3) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ((ke3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                return ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                ((ke3) create((c06) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ((ke3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                ((ke3) create((e5i) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                return ((ke3) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                ((ke3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0591  */
    /* JADX WARN: Code duplicated, block: B:188:0x0594  */
    /* JADX WARN: Code duplicated, block: B:191:0x0599  */
    /* JADX WARN: Code duplicated, block: B:193:0x059e  */
    /* JADX WARN: Code duplicated, block: B:196:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:330:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x013f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
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
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v59 java.lang.Object, still in use, count: 2, list:
          (r4v59 java.lang.Object) from 0x058d: PHI (r4 I:??) = (r4v50 java.lang.Object), (r4v59 java.lang.Object) binds: [B:184:0x058c, B:364:0x058d] A[DONT_GENERATE, DONT_INLINE]
          (r4v59 java.lang.Object) from 0x0583: CHECK_CAST (lve) (r4v59 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 3108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke3(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke3(int i, lq4 lq4Var, Widget widget) {
        super(2, lq4Var);
        this.e = i;
        this.g = widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke3(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
