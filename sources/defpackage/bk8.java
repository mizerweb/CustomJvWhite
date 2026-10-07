package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import one.me.login.confirm.ConfirmPhoneScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class bk8 {
    public final hve a;
    public final t3f b;

    public bk8(hve hveVar, t3f t3fVar) {
        this.a = hveVar;
        this.b = t3fVar;
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
    public final void a(boolean z, boolean z2) {
        Bundle bundle;
        Object objPrevious;
        br4 br4Var;
        if (z) {
            bundle = new Bundle();
            bundle.putString("screen:input_phone:phone", "");
        } else {
            bundle = null;
        }
        hve hveVar = this.a;
        ArrayList arrayListE = hveVar.e();
        HashSet hashSet = new HashSet();
        Iterator it = new upe(hveVar.e()).iterator();
        while (true) {
            ListIterator listIterator = ((tpe) it).b;
            if (!listIterator.hasPrevious()) {
                break;
            }
            lve lveVar = (lve) listIterator.previous();
            if (cqk.d(lveVar.b, "InputPhoneScreen")) {
                break;
            } else {
                hashSet.add(lveVar);
            }
        }
        ListIterator listIterator2 = arrayListE.listIterator(arrayListE.size());
        do {
            if (!listIterator2.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator2.previous();
        } while (!cqk.d(((lve) objPrevious).b, "InputPhoneScreen"));
        lve lveVar2 = (lve) objPrevious;
        if (lveVar2 == null || (br4Var = lveVar2.a) == null) {
            gm0.Y(bk8.class.getName(), "Early return in goBackTo cuz of newBackStack.findLast { it.tag() == tag }?.controller is null");
            return;
        }
        if (bundle != null) {
            br4Var.getArgs().putAll(bundle);
        }
        arrayListE.removeAll(hashSet);
        hveVar.R(arrayListE, z2 ? new ry7(0) : null);
    }

    public final void c(lve lveVar, String str) {
        lveVar.e(str);
        lveVar.c(new ry7(0));
        lveVar.a(new ry7(0));
        this.a.I(lveVar);
    }

    public final void d(String str, String str2, int i, long j, String str3) {
        c(oc9.e(new ConfirmPhoneScreen(str, str2, i, j, str3, this.b), null, null), "ConfirmPhoneScreen");
    }
}
