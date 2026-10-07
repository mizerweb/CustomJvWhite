package defpackage;

import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ekd[], still in use, count: 1, list:
  (r0v1 ekd[]) from 0x007b: CONSTRUCTOR (r0v1 ekd[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class ekd {
    SAVE(new tnh(R.string.save_to_gallery), new tnh(R.string.saving_image_successful), new tnh(R.string.saving_image_fail)),
    SHARE(new tnh(R.string.share), null, new tnh(R.string.share_photo_fail)),
    SET_MAIN(new tnh(R.string.menu_avatar_photo__main), new tnh(R.string.photo_changed), null),
    DELETE(new tnh(R.string.menu_delete), new tnh(R.string.photo_removed), null);

    public static final /* synthetic */ ma6 i;
    public final tnh a;
    public final ynh b;
    public final ynh c;

    static {
        i = new ma6(ekdVarArr);
    }

    public ekd(tnh tnhVar, tnh tnhVar2, tnh tnhVar3) {
        super(str, i);
        this.a = tnhVar;
        this.b = tnhVar2;
        this.c = tnhVar3;
    }

    public static ekd valueOf(String str) {
        return (ekd) Enum.valueOf(ekd.class, str);
    }

    public static ekd[] values() {
        return (ekd[]) h.clone();
    }
}
