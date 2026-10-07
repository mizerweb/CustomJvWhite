package one.me.sdk.emoji.sprite;

import defpackage.qv1;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/sdk/emoji/sprite/IllegalWidthSpriteException;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "spriteIndex", "currentWidth", "requiredWidth", "densityDpi", "<init>", "(IIII)V", "emoji"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IllegalWidthSpriteException extends IssueKeyException {
    /* JADX WARN: Illegal instructions before constructor call */
    public IllegalWidthSpriteException(int i, int i2, int i3, int i4) {
        StringBuilder sbP = qv1.p("Sprite is not width enough - index: ", i, "; width: ", i2, "; requiredWidth: ");
        sbP.append(i3);
        sbP.append(", densityDpi: ");
        sbP.append(i4);
        super(4, "emoji_size", sbP.toString(), null);
    }
}
