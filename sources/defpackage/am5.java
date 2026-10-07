package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class am5 implements o31 {
    public static final /* synthetic */ zv8[] c = {new dwd(am5.class, "cleanerGetter", "getCleanerGetter()Ljava/lang/reflect/Method;", 0), zo5.f(zfe.a, am5.class, "cleanMethod", "getCleanMethod()Ljava/lang/reflect/Method;", 0)};
    public final j55 a = new j55(new fj3(15, "sun.nio.ch.DirectBuffer"), "cleaner");
    public final j55 b = new j55(new fj3(15, "sun.misc.Cleaner"), "clean");

    @Override // defpackage.o31
    public final ByteBuffer a(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    @Override // defpackage.o31
    public final void b(ByteBuffer byteBuffer) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        zv8[] zv8VarArr = c;
        Method method = (Method) this.a.m(this, zv8VarArr[0]);
        if (method == null || (objInvoke = method.invoke(byteBuffer, null)) == null) {
            return;
        }
        Method method2 = (Method) this.b.m(this, zv8VarArr[1]);
        if (method2 != null) {
            method2.invoke(objInvoke, null);
        }
    }
}
