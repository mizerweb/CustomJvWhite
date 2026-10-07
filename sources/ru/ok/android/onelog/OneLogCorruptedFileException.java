package ru.ok.android.onelog;

import defpackage.zo5;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
final class OneLogCorruptedFileException extends RuntimeException {
    private final File file;

    public OneLogCorruptedFileException(File file, Throwable th) {
        super(zo5.m(file, "OneLog file is corrupted: "), th);
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }
}
