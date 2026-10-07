package one.me.sdk.gl.effects.objects;

import defpackage.a4c;
import defpackage.ffk;
import defpackage.gm0;
import defpackage.je9;
import defpackage.jik;
import defpackage.ugk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lone/me/sdk/gl/effects/objects/OesToImage2dRenderer;", "", "<init>", "()V", "Lsbi;", "release", "", "oesTexName", "", "textMatrix", ugk.VERTEX_SHADER_UNI_MVP_MATRIX, "render", "(I[F[F)V", "", "tag", "Ljava/lang/String;", "Ljik;", "program", "Ljik;", "Lffk;", "frame", "Lffk;", "gl-effects"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OesToImage2dRenderer {
    private final ffk frame;
    private final jik program;
    private final String tag;

    public OesToImage2dRenderer() {
        String name = OesToImage2dRenderer.class.getName();
        this.tag = name;
        jik jikVar = new jik("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        this.program = jikVar;
        this.frame = new ffk(jikVar.getVertexCoordLoc(), jikVar.getTextureCoordLoc());
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "init", null);
        }
    }

    public static /* synthetic */ void render$default(OesToImage2dRenderer oesToImage2dRenderer, int i, float[] fArr, float[] fArr2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fArr = null;
        }
        if ((i2 & 4) != 0) {
            fArr2 = null;
        }
        oesToImage2dRenderer.render(i, fArr, fArr2);
    }

    public final void release() {
        gm0.Y(this.tag, "release");
        this.frame.a.a();
        this.program.release();
    }

    public final void render(int oesTexName, float[] textMatrix, float[] fArr) {
        this.program.setTextureId(oesTexName);
        this.program.setTexMat(textMatrix);
        this.program.setMVPMat(fArr);
        this.program.use();
        this.frame.a.b();
        this.program.unUse();
    }
}
