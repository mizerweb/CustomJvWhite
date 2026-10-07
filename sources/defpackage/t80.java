package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class t80 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public t80(i18 i18Var, zo zoVar, uo uoVar, int i, boolean z) {
        this.e = i18Var;
        this.c = zoVar;
        this.d = uoVar;
        this.a = i;
        this.b = z;
    }

    public u80 a() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) this.c;
        if (onAudioFocusChangeListener == null) {
            ore.k("Can't build an AudioFocusRequestCompat instance without a listener");
            return null;
        }
        int i = this.a;
        Handler handler = (Handler) this.d;
        handler.getClass();
        return new u80(i, onAudioFocusChangeListener, handler, (p70) this.e, this.b);
    }

    public void b(p70 p70Var) {
        p70Var.getClass();
        this.e = p70Var;
    }

    public void c(n80 n80Var, Handler handler) {
        handler.getClass();
        this.c = n80Var;
        this.d = handler;
    }

    public void d(boolean z) {
        this.b = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void e(BufferedOutputStream bufferedOutputStream) throws IOException {
        int i = this.a;
        uo uoVar = (uo) this.d;
        op opVar = (op) this.c;
        mp4 mp4Var = ((i18) this.e).b;
        if (!this.b) {
            mp4Var.b(bufferedOutputStream, opVar, uoVar, i);
            return;
        }
        f18 f18Var = new f18(bufferedOutputStream);
        mp4Var.b(f18Var, opVar, uoVar, i);
        f18Var.finish();
        f18Var.l();
    }

    public t80(int i) {
        this.e = p70.i;
        this.a = i;
    }
}
