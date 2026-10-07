package defpackage;

import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 d46[], still in use, count: 1, list:
  (r0v1 d46[]) from 0x00e5: CONSTRUCTOR (r0v1 d46[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class d46 {
    /* JADX INFO: Fake field, exist only in values array */
    RECENT(-1, new tnh(R.string.oneme_media_keyboard_recent), R.drawable.icon_clock_mini),
    CLASSIC(0, new tnh(R.string.oneme_media_keyboard_emoji_classic), R.drawable.icon_smile_happy),
    /* JADX INFO: Fake field, exist only in values array */
    GESTURES_AND_PEOPLE(1, new tnh(R.string.oneme_media_keyboard_emoji_gestures_and_people), R.drawable.icon_block_contact),
    /* JADX INFO: Fake field, exist only in values array */
    ANIMALS_AND_PLANTS(2, new tnh(R.string.oneme_media_keyboard_emoji_animals_and_plants), R.drawable.icon_animals),
    /* JADX INFO: Fake field, exist only in values array */
    FOOD_AND_DRINK(3, new tnh(R.string.oneme_media_keyboard_emoji_food_and_drink), R.drawable.icon_fruits_and_vegetables),
    /* JADX INFO: Fake field, exist only in values array */
    SPORT_AND_ACTIVITY(4, new tnh(R.string.oneme_media_keyboard_emoji_sport_and_activity), R.drawable.icon_sport),
    /* JADX INFO: Fake field, exist only in values array */
    TRAVELS_AND_TRANSPORT(5, new tnh(R.string.oneme_media_keyboard_emoji_travels_and_transport), R.drawable.icon_transport),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECTS(6, new tnh(R.string.oneme_media_keyboard_emoji_objects), R.drawable.icon_bulb),
    /* JADX INFO: Fake field, exist only in values array */
    SYMBOLS(7, new tnh(R.string.oneme_media_keyboard_emoji_symbols), R.drawable.icon_symbols),
    /* JADX INFO: Fake field, exist only in values array */
    FLAGS(8, new tnh(R.string.oneme_media_keyboard_emoji_flags), R.drawable.icon_flag),
    ANIMOJI(9, ynh.b, 0);

    public static final /* synthetic */ ma6 g;
    public final int a;
    public final ynh b;
    public final int c;

    static {
        g = new ma6(d46VarArr);
    }

    public d46(int i, ynh ynhVar, int i2) {
        super(str, i);
        this.a = i;
        this.b = ynhVar;
        this.c = i2;
    }

    public static d46 valueOf(String str) {
        return (d46) Enum.valueOf(d46.class, str);
    }

    public static d46[] values() {
        return (d46[]) f.clone();
    }
}
