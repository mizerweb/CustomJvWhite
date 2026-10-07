package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class nj5 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ Object[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj5(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        yx6 yx6Var = (yx6) obj;
        Object[] objArr = (Object[]) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                nj5 nj5Var = new nj5(i2, lq4Var, 0);
                nj5Var.g = yx6Var;
                nj5Var.h = objArr;
                return nj5Var.invokeSuspend(sbiVar);
            case 1:
                nj5 nj5Var2 = new nj5(i2, lq4Var, 1);
                nj5Var2.g = yx6Var;
                nj5Var2.h = objArr;
                return nj5Var2.invokeSuspend(sbiVar);
            case 2:
                nj5 nj5Var3 = new nj5(i2, lq4Var, 2);
                nj5Var3.g = yx6Var;
                nj5Var3.h = objArr;
                return nj5Var3.invokeSuspend(sbiVar);
            case 3:
                nj5 nj5Var4 = new nj5(i2, lq4Var, i2);
                nj5Var4.g = yx6Var;
                nj5Var4.h = objArr;
                return nj5Var4.invokeSuspend(sbiVar);
            case 4:
                nj5 nj5Var5 = new nj5(i2, lq4Var, 4);
                nj5Var5.g = yx6Var;
                nj5Var5.h = objArr;
                return nj5Var5.invokeSuspend(sbiVar);
            default:
                nj5 nj5Var6 = new nj5(i2, lq4Var, 5);
                nj5Var6.g = yx6Var;
                nj5Var6.h = objArr;
                return nj5Var6.invokeSuspend(sbiVar);
        }
    }

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
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objSingletonMap;
        og4 og4Var;
        int i = this.e;
        int i2 = 0;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        og4 og4Var2 = null;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var = this.g;
                List[] listArr = (List[]) this.h;
                ArrayList arrayList = new ArrayList();
                int length = listArr.length;
                while (i2 < length) {
                    cx3.Z0(listArr[i2], arrayList);
                    i2++;
                }
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var.emit(arrayList, this) == hu4Var ? hu4Var : sbiVar;
            case 1:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var2 = this.g;
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var2.emit(sbiVar, this) == hu4Var ? hu4Var : sbiVar;
            case 2:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var3 = this.g;
                Integer num = (Integer) a.i1((Integer[]) this.h);
                Integer num2 = new Integer(num != null ? num.intValue() : 0);
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var3.emit(num2, this) == hu4Var ? hu4Var : sbiVar;
            case 3:
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var4 = this.g;
                oyc[] oycVarArr = (oyc[]) this.h;
                int iP0 = wm9.P0(oycVarArr.length);
                if (iP0 < 16) {
                    iP0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
                int length2 = oycVarArr.length;
                while (i2 < length2) {
                    oyc oycVar = oycVarArr[i2];
                    linkedHashMap.put(new Long(oycVar.a), oycVar);
                    i2++;
                }
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var4.emit(linkedHashMap, this) == hu4Var ? hu4Var : sbiVar;
            case 4:
                int i7 = this.f;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var5 = this.g;
                ylc[] ylcVarArr = (ylc[]) this.h;
                int length3 = ylcVarArr.length;
                if (length3 == 0) {
                    objSingletonMap = s66.a;
                } else if (length3 != 1) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(wm9.P0(ylcVarArr.length));
                    wm9.U0(linkedHashMap2, ylcVarArr);
                    objSingletonMap = linkedHashMap2;
                } else {
                    ylc ylcVar = ylcVarArr[0];
                    objSingletonMap = Collections.singletonMap(ylcVar.a, ylcVar.b);
                }
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var5.emit(objSingletonMap, this) == hu4Var ? hu4Var : sbiVar;
            default:
                int i8 = this.f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var6 = this.g;
                og4[] og4VarArr = (og4[]) this.h;
                int length4 = og4VarArr.length;
                while (true) {
                    og4Var = mg4.a;
                    if (i2 < length4) {
                        og4 og4Var3 = og4VarArr[i2];
                        if (cqk.d(og4Var3, og4Var)) {
                            i2++;
                        } else {
                            og4Var2 = og4Var3;
                        }
                    }
                }
                if (og4Var2 != null) {
                    og4Var = og4Var2;
                }
                this.f = 1;
                return yx6Var6.emit(og4Var, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
