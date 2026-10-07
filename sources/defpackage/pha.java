package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class pha extends p1c {
    public final /* synthetic */ tha b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pha(Context context, tha thaVar) {
        super(context, 14);
        this.b = thaVar;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        tha thaVar = this.b;
        if (thaVar.d == null) {
            return;
        }
        boolean zHasSelection = hasSelection();
        oha ohaVar = thaVar.d;
        if (!zHasSelection) {
            if (ohaVar != null) {
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) ((i1m) ohaVar).a;
                zv8[] zv8VarArr = MessageWriteWidget.I;
                qj9 qj9VarU1 = messageWriteWidget.u1();
                qj9VarU1.getClass();
                qj9.B(qj9VarU1, 1);
                return;
            }
            return;
        }
        if (ohaVar != null) {
            MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) ((i1m) ohaVar).a;
            zv8[] zv8VarArr2 = MessageWriteWidget.I;
            qj9 qj9VarU2 = messageWriteWidget2.u1();
            if (((rj9) qj9VarU2.g.getValue()).b != 1) {
                gm0.n(qj9.class.getName(), "Early return in textSelected cuz of _viewState.value.menuState != MenuState.HIDDEN");
            } else {
                qj9.B(qj9VarU2, 2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
