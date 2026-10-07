package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d86(m0a m0aVar, iu9 iu9Var, String str, Bundle bundle) {
        this.a = 11;
        this.b = iu9Var;
        this.c = str;
        this.d = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0476  */
    /* JADX WARN: Code duplicated, block: B:152:0x047a  */
    /* JADX WARN: Code duplicated, block: B:154:0x047e  */
    /* JADX WARN: Code duplicated, block: B:158:0x04ac A[LOOP:2: B:156:0x04a6->B:158:0x04ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:281:0x0797  */
    /* JADX WARN: Code duplicated, block: B:282:0x079c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x014c  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0152, code lost:
    
        if (r1.g.s() == false) goto L89;
     */
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
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 2548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d86.run():void");
    }

    public /* synthetic */ d86(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ d86(Runnable runnable, ow6 ow6Var, FitFontImageSpan fitFontImageSpan) {
        this.a = 5;
        this.d = runnable;
        this.b = ow6Var;
        this.c = fitFontImageSpan;
    }

    public /* synthetic */ d86(FeedbackListenerManagerImpl feedbackListenerManagerImpl, List list, ArrayList arrayList) {
        this.a = 4;
        this.b = feedbackListenerManagerImpl;
        this.d = list;
        this.c = arrayList;
    }
}
