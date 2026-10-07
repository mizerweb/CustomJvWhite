package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum m3h implements lrc {
    LEAVE_SCREEN(1),
    MOVED_TO_OTHER_OWNER(2),
    MOVED_TO_OTHER_STORY(3),
    PHOTO_LOAD_ERROR(4),
    VIDEO_LOAD_ERROR(5),
    STORIES_LOAD_ERROR(6);

    public final int a;

    m3h(int i) {
        this.a = i;
    }

    @Override // defpackage.lrc
    public final int a() {
        return this.a;
    }
}
