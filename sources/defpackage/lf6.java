package defpackage;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.transformer.ExportException;

/* JADX INFO: loaded from: classes2.dex */
public final class lf6 implements j3d {
    public final dy a;
    public final /* synthetic */ j28 b;

    public lf6(j28 j28Var, dy dyVar) {
        this.b = j28Var;
        this.a = dyVar;
    }

    @Override // defpackage.j3d
    public final void T(PlaybackException playbackException) {
        Throwable cause = playbackException.getCause();
        if ((cause instanceof ExoTimeoutException) && ((ExoTimeoutException) cause).a == 1) {
            lvb.l0("ExoPlayerAssetLoader", "Releasing the player timed out.", playbackException);
        } else {
            Object obj = ExportException.c.get(playbackException.b());
            this.a.b(ExportException.a(((Integer) (obj != null ? obj : 1000)).intValue(), playbackException));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
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
    @Override // defpackage.j3d
    public final void t0(fzh fzhVar) {
        ?? r0 = this.a;
        boolean z = true;
        try {
            ?? A = fzhVar.a(1);
            ?? r2 = A;
            if (fzhVar.a(2)) {
                r2 = A + 1;
            }
            for (int i = 0; i < fzhVar.a.size(); i++) {
                int i2 = ((ezh) fzhVar.a.get(i)).b.c;
                if (i2 != 1 && i2 != 2) {
                    qt4.y(i2, "Unsupported track type: ", "ExoPlayerAssetLoader");
                }
            }
            j28 j28Var = this.b;
            if (r2 > 0) {
                r0.a(r2);
                ((bg6) j28Var.f).n(true);
                return;
            }
            String strI = izl.i((Context) j28Var.c, ((s26) j28Var.d).a);
            if (strI == null || !uya.k(strI)) {
                z = false;
            }
            r0.b(ExportException.a(1001, new IllegalStateException(z ? "The asset loader has no audio or video track to output. Try setting an image duration on input image MediaItems." : "The asset loader has no audio or video track to output.")));
        } catch (RuntimeException e) {
            r0.b(ExportException.a(1000, e));
        }
    }

    @Override // defpackage.j3d
    public final void y0(ush ushVar, int i) {
        dy dyVar = this.a;
        j28 j28Var = this.b;
        try {
            if (j28Var.b != 1) {
                return;
            }
            tsh tshVar = new tsh();
            ushVar.n(0, tshVar);
            if (tshVar.j) {
                return;
            }
            long j = tshVar.l;
            j28Var.b = (j <= 0 || j == -9223372036854775807L) ? 3 : 2;
            dyVar.d(j);
        } catch (RuntimeException e) {
            dyVar.b(ExportException.a(1000, e));
        }
    }
}
