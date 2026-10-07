package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class mpa extends mj9 {
    public final /* synthetic */ ny8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpa(ny8 ny8Var) {
        super(6);
        this.g = ny8Var;
    }

    @Override // defpackage.mj9
    public final Object a(Object obj) {
        e5i e5iVar = (e5i) obj;
        int iIntValue = ((Number) e5iVar.a).intValue();
        float fFloatValue = ((Number) e5iVar.b).floatValue();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAntiAlias(true);
        textPaint.setColor(iIntValue);
        textPaint.setTextSize(fFloatValue);
        textPaint.linkColor = ((vxb) ((a31) this.g.getValue())).f();
        return textPaint;
    }
}
