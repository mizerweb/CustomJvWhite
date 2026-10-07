package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 s71[], still in use, count: 1, list:
  (r0v1 s71[]) from 0x00ad: CONSTRUCTOR (r1v2 ma6) = (r0v1 s71[]) A[MD:(java.lang.Enum[]):void (m)] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class s71 {
    /* JADX INFO: Fake field, exist only in values array */
    IMAGES(R.id.oneme_settings_storage_item_images, R.id.oneme_settings_storage_item_action_images_clear, R.id.oneme_settings_storage_item_action_images_cancel, R.string.oneme_settings_storage_images, R.string.oneme_settings_storage_clear_cache_dialog_images_title),
    AUDIO(R.id.oneme_settings_storage_item_audio_messages, R.id.oneme_settings_storage_item_action_audio_clear, R.id.oneme_settings_storage_item_action_audio_cancel, R.string.oneme_settings_storage_audio_messages, R.string.oneme_settings_storage_clear_cache_dialog_audio_title),
    /* JADX INFO: Fake field, exist only in values array */
    GIF(R.id.oneme_settings_storage_item_gif, R.id.oneme_settings_storage_item_action_gif_clear, R.id.oneme_settings_storage_item_action_gif_cancel, R.string.oneme_settings_storage_gif, R.string.oneme_settings_storage_clear_cache_dialog_gif_title),
    /* JADX INFO: Fake field, exist only in values array */
    STICKERS(R.id.oneme_settings_storage_item_stickers, R.id.oneme_settings_storage_item_action_stickers_clear, R.id.oneme_settings_storage_item_action_stickers_cancel, R.string.oneme_settings_storage_stickers, R.string.oneme_settings_storage_clear_cache_dialog_stickers_title),
    MUSIC(R.id.oneme_settings_storage_item_music, R.id.oneme_settings_storage_item_action_music_clear, R.id.oneme_settings_storage_item_action_music_cancel, R.string.oneme_settings_storage_music, R.string.oneme_settings_storage_clear_cache_dialog_music_title),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO(R.id.oneme_settings_storage_item_video, R.id.oneme_settings_storage_item_action_video_clear, R.id.oneme_settings_storage_item_action_video_cancel, R.string.oneme_settings_storage_video, R.string.oneme_settings_storage_clear_cache_dialog_video_title),
    /* JADX INFO: Fake field, exist only in values array */
    OTHERS(R.id.oneme_settings_storage_item_files, R.id.oneme_settings_storage_item_action_files_clear, R.id.oneme_settings_storage_item_action_files_cancel, R.string.oneme_settings_storage_files, R.string.oneme_settings_storage_clear_cache_dialog_files_title);

    public static final ArrayList f;
    public static final ArrayList g;
    public static final /* synthetic */ ma6 k;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        ma6 ma6Var = new ma6(s71VarArr);
        k = ma6Var;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        Iterator it = ma6Var.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                break;
            } else {
                arrayList.add(Integer.valueOf(((s71) y1Var.next()).a));
            }
        }
        f = arrayList;
        ma6 ma6Var2 = k;
        ArrayList arrayList2 = new ArrayList(yw3.W0(ma6Var2, 10));
        Iterator it2 = ma6Var2.iterator();
        while (true) {
            y1 y1Var2 = (y1) it2;
            if (!y1Var2.hasNext()) {
                g = arrayList2;
                return;
            }
            arrayList2.add(Integer.valueOf(((s71) y1Var2.next()).b));
        }
    }

    public s71(int i, int i2, int i3, int i4, int i5) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static s71 valueOf(String str) {
        return (s71) Enum.valueOf(s71.class, str);
    }

    public static s71[] values() {
        return (s71[]) j.clone();
    }
}
