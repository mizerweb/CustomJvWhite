package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public enum np6 {
    e(R.attr.file_type_unknown_bkg, R.attr.file_type_unknown_element, R.attr.file_type_unknown_icon, "UNKNOWN"),
    f(R.attr.file_type_presentation_bkg, R.attr.file_type_presentation_element, R.attr.file_type_presentation_icon, "DOCS"),
    g(R.attr.file_type_data_bkg, R.attr.file_type_data_element, R.attr.file_type_data_icon, "TABLES"),
    h(R.attr.file_type_text_bkg, R.attr.file_type_text_element, R.attr.file_type_text_icon, "TEXTS"),
    i(R.attr.file_type_image_bkg, R.attr.file_type_image_element, R.attr.file_type_image_icon, "IMAGES"),
    j(R.attr.file_type_video_bkg, R.attr.file_type_video_element, R.attr.file_type_video_icon, "VIDEOS"),
    k(R.attr.file_type_archive_bkg, R.attr.file_type_archive_element, R.attr.file_type_archive_icon, "ARCHIVES"),
    l(R.attr.file_type_program_bkg, R.attr.file_type_program_element, R.attr.file_type_program_icon, "BINS"),
    m(R.attr.file_type_music_bkg, R.attr.file_type_music_element, R.attr.file_type_music_icon, "MUSIC");

    public final int a;
    public final int b;
    public final int c;
    public final int d;

    np6(int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
