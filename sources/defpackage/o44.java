package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class o44 implements pz0 {
    public final ny8 a;

    public o44(int i) {
        switch (i) {
            case 1:
                this.a = rx8.P(2, new tyd(18));
                break;
            default:
                this.a = rx8.P(3, new zn3(3));
                break;
        }
    }

    @Override // defpackage.pz0
    public void a(Canvas canvas, Bitmap bitmap) {
        canvas.drawRenderNode(d());
    }

    @Override // defpackage.pz0
    public void b(int i) {
        d().setAlpha(i / 255.0f);
    }

    @Override // defpackage.pz0
    public void c(Bitmap bitmap, float f) {
        d().setPosition(0, 0, bitmap.getWidth(), bitmap.getHeight());
        d().beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        d().endRecording();
        RenderNode renderNodeD = d();
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        renderNodeD.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
    }

    public RenderNode d() {
        return ht6.f(this.a.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable e(String str, mk8 mk8Var, nq4 nq4Var) {
        h7i h7iVar;
        long j;
        if (nq4Var instanceof h7i) {
            h7iVar = (h7i) nq4Var;
            int i = h7iVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h7iVar.f = i - Integer.MIN_VALUE;
            } else {
                h7iVar = new h7i(this, nq4Var);
            }
        } else {
            h7iVar = new h7i(this, nq4Var);
        }
        Object obj = h7iVar.d;
        int i2 = h7iVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                int iOrdinal = mk8Var.ordinal();
                ny8 ny8Var = this.a;
                hu4 hu4Var = hu4.a;
                if (iOrdinal == 0) {
                    pvb pvbVar = (pvb) ny8Var.getValue();
                    vsb vsbVar = new vsb(kfc.w, 13);
                    vsbVar.h("trackId", str);
                    vsbVar.a("delete", true);
                    h7iVar.f = 1;
                    Object objD = pvbVar.D(vsbVar, h7iVar);
                    if (objD != hu4Var) {
                        obj = objD;
                        j = ((rd0) obj).c;
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pvb pvbVar2 = (pvb) ny8Var.getValue();
                    h3b h3bVar = new h3b(true, 2);
                    h7iVar.f = 2;
                    Object objD2 = pvbVar2.D(h3bVar, h7iVar);
                    if (objD2 != hu4Var) {
                        obj = objD2;
                        j = ((bje) obj).c;
                    }
                }
                return hu4Var;
            }
            if (i2 == 1) {
                ch3.d0(obj);
                j = ((rd0) obj).c;
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                j = ((bje) obj).c;
            }
            return new Long(j);
        } catch (Throwable th) {
            return new poe(th);
        }
    }

    @Override // defpackage.pz0
    public void onDestroy() {
        d().discardDisplayList();
    }

    public o44(ny8 ny8Var) {
        this.a = ny8Var;
    }
}
