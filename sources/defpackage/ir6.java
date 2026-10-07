package defpackage;

import android.content.Context;
import android.graphics.drawable.DrawableWrapper;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ir6 extends DrawableWrapper {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public ir6(Context context) {
        super(new EnhancedVectorDrawable(context, R.drawable.ic_file_extension));
        final int i = 0;
        this.a = rx8.P(3, new af7(this) { // from class: hr6
            public final /* synthetic */ ir6 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ir6 ir6Var = this.b;
                switch (i2) {
                    case 0:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("corner");
                }
            }
        });
        final int i2 = 1;
        this.b = rx8.P(3, new af7(this) { // from class: hr6
            public final /* synthetic */ ir6 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                ir6 ir6Var = this.b;
                switch (i3) {
                    case 0:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("corner");
                }
            }
        });
        final int i3 = 2;
        this.c = rx8.P(3, new af7(this) { // from class: hr6
            public final /* synthetic */ ir6 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                ir6 ir6Var = this.b;
                switch (i4) {
                    case 0:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("background");
                    case 1:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("foreground");
                    default:
                        return ((EnhancedVectorDrawable) ir6Var.getDrawable()).findPath("corner");
                }
            }
        });
    }
}
