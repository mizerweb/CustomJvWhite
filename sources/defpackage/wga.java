package defpackage;

import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wga implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tha b;

    public /* synthetic */ wga(tha thaVar, int i) {
        this.a = i;
        this.b = thaVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        tha thaVar = this.b;
        switch (i) {
            case 0:
                return thaVar.getContext().getDrawable(thaVar.c).mutate();
            case 1:
                return tha.c(thaVar);
            case 2:
                return thaVar.getContext().getDrawable(R.drawable.icon_check).mutate();
            case 3:
                return tha.b(thaVar);
            case 4:
                return thaVar.getContext().getDrawable(R.drawable.icon_heart).mutate();
            case 5:
                return thaVar.getContext().getDrawable(R.drawable.icon_heart_fill).mutate();
            case 6:
                return thaVar.getContext().getDrawable(R.drawable.icon_microphone).mutate();
            case 7:
                return thaVar.getContext().getDrawable(R.drawable.icon_arrow_up).mutate();
            case 8:
                return thaVar.getContext().getDrawable(R.drawable.icon_arrow_down).mutate();
            default:
                zv8[] zv8VarArr = MessageWriteWidget.I;
                return Boolean.valueOf(thaVar.f.getTag(R.id.text_change_is_programmatic_tag) != null);
        }
    }
}
