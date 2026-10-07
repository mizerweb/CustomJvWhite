package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class zfh implements ptb, otb {
    public final Object a;

    public zfh() {
        this.a = new ifh(new yvg(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, nq4 nq4Var) {
        vik vikVar;
        if (nq4Var instanceof vik) {
            vikVar = (vik) nq4Var;
            int i = vikVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                vikVar.g = i - Integer.MIN_VALUE;
            } else {
                vikVar = new vik(this, nq4Var);
            }
        } else {
            vikVar = new vik(this, nq4Var);
        }
        Object objInvoke = vikVar.e;
        int i2 = vikVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objInvoke);
            p25 p25Var = (p25) this.a;
            vikVar.d = str;
            vikVar.g = 1;
            objInvoke = p25Var.invoke(vikVar);
            if (objInvoke != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objInvoke);
                return ((roe) objInvoke).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = vikVar.d;
        ch3.d0(objInvoke);
        r7k r7kVar = ((o7k) objInvoke).b;
        vikVar.d = null;
        vikVar.g = 2;
        Object objH = r7kVar.h(str, vikVar);
        return objH == hu4Var ? hu4Var : objH;
    }

    public void b(EventItemsMap eventItemsMap) {
        eventItemsMap.getClass();
        j42 j42Var = (j42) ((af7) ((due) this.a).a).invoke();
        eventItemsMap.set("call_topology", ewh.$EnumSwitchMapping$0[j42Var.w().ordinal()] != 1 ? "D" : "S");
        fm5 fm5Var = j42Var instanceof fm5 ? (fm5) j42Var : null;
        Boolean boolValueOf = fm5Var != null ? Boolean.valueOf(fm5Var.P) : null;
        eventItemsMap.set("p2p_relay", String.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[Catch: aP -> 0x004d, bt -> 0x0051, bz -> 0x0171, TryCatch #2 {aP -> 0x004d, bt -> 0x0051, bz -> 0x0171, blocks: (B:5:0x000e, B:7:0x001b, B:9:0x0025, B:11:0x002b, B:13:0x0034, B:15:0x0047, B:51:0x00b8, B:53:0x00c4, B:55:0x00ce, B:57:0x00dd, B:59:0x00ee, B:61:0x00f4, B:63:0x010c, B:64:0x0120, B:58:0x00e5, B:20:0x0053, B:25:0x005e, B:26:0x0067, B:31:0x0073, B:32:0x007b, B:37:0x0086, B:39:0x008d, B:44:0x0098, B:45:0x009d, B:46:0x009e, B:47:0x00a3, B:48:0x00a4, B:49:0x00ab, B:50:0x00ac, B:65:0x0135, B:66:0x013a, B:67:0x013b, B:68:0x0142), top: B:83:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: aP -> 0x004d, bt -> 0x0051, bz -> 0x0171, TryCatch #2 {aP -> 0x004d, bt -> 0x0051, bz -> 0x0171, blocks: (B:5:0x000e, B:7:0x001b, B:9:0x0025, B:11:0x002b, B:13:0x0034, B:15:0x0047, B:51:0x00b8, B:53:0x00c4, B:55:0x00ce, B:57:0x00dd, B:59:0x00ee, B:61:0x00f4, B:63:0x010c, B:64:0x0120, B:58:0x00e5, B:20:0x0053, B:25:0x005e, B:26:0x0067, B:31:0x0073, B:32:0x007b, B:37:0x0086, B:39:0x008d, B:44:0x0098, B:45:0x009d, B:46:0x009e, B:47:0x00a3, B:48:0x00a4, B:49:0x00ab, B:50:0x00ac, B:65:0x0135, B:66:0x013a, B:67:0x013b, B:68:0x0142), top: B:83:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007b A[Catch: aP -> 0x004d, bt -> 0x0051, bz -> 0x0171, TryCatch #2 {aP -> 0x004d, bt -> 0x0051, bz -> 0x0171, blocks: (B:5:0x000e, B:7:0x001b, B:9:0x0025, B:11:0x002b, B:13:0x0034, B:15:0x0047, B:51:0x00b8, B:53:0x00c4, B:55:0x00ce, B:57:0x00dd, B:59:0x00ee, B:61:0x00f4, B:63:0x010c, B:64:0x0120, B:58:0x00e5, B:20:0x0053, B:25:0x005e, B:26:0x0067, B:31:0x0073, B:32:0x007b, B:37:0x0086, B:39:0x008d, B:44:0x0098, B:45:0x009d, B:46:0x009e, B:47:0x00a3, B:48:0x00a4, B:49:0x00ab, B:50:0x00ac, B:65:0x0135, B:66:0x013a, B:67:0x013b, B:68:0x0142), top: B:83:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0162  */
    /* JADX WARN: Code duplicated, block: B:88:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (r8 == 1) goto L44;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.nio.ByteBuffer r8, defpackage.c4h r9) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfh.c(java.nio.ByteBuffer, c4h):void");
    }

    @Override // defpackage.otb
    public void j(Task task) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.ptb
    public void onComplete(Throwable th) {
        if (th instanceof TaskCancellationException) {
            cqk.g((gu4) this.a);
        }
    }

    public zfh(k3j k3jVar) {
        k3jVar.getClass();
        this.a = k3jVar;
    }

    public /* synthetic */ zfh(Object obj) {
        this.a = obj;
    }
}
