package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class t35 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ u35 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public t35(u35 u35Var, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 3:
                Boolean bool = Boolean.FALSE;
                this.d = u35Var;
                super(i2, bool);
                break;
            default:
                Boolean bool2 = Boolean.FALSE;
                this.d = u35Var;
                super(i2, bool2);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        u35 u35Var = this.d;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!cqk.d((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    BoringLayout.Metrics metrics = u35Var.getMetrics();
                    TextPaint textPaint = u35.y;
                    metrics.width = gm0.K(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(u35Var.l);
                    u35Var.q = BoringLayout.make(charSequence, textPaint, metrics.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metrics, false);
                    u35Var.invalidate();
                    u35Var.requestLayout();
                    break;
                }
                break;
            case 1:
                CharSequence charSequence2 = (CharSequence) obj2;
                if (!cqk.d((CharSequence) obj, charSequence2)) {
                    if (charSequence2 != null) {
                        BoringLayout.Metrics metrics2 = u35Var.getMetrics();
                        TextPaint textPaint2 = u35.y;
                        metrics2.width = gm0.K(textPaint2.measureText(charSequence2, 0, charSequence2.length()));
                        textPaint2.setColor(u35Var.l);
                        u35Var.r = BoringLayout.make(charSequence2, textPaint2, metrics2.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metrics2, false);
                        u35Var.invalidate();
                        u35Var.requestLayout();
                    } else {
                        u35Var.r = null;
                        u35Var.requestLayout();
                    }
                }
                break;
            case 2:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                u35Var.invalidate();
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    u35Var.e(u35Var.o);
                    u35Var.invalidate();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t35(u35 u35Var, int i, boolean z) {
        super(4, null);
        this.c = i;
        this.d = u35Var;
    }
}
