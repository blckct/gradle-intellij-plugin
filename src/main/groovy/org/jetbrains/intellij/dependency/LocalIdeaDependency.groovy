package org.jetbrains.intellij.dependency

import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable

class LocalIdeaDependency extends IdeaDependency {
    LocalIdeaDependency(@NotNull String name, @NotNull String version, @NotNull String buildNumber,
                        @NotNull File classes, @Nullable File sources, boolean withKotlin,
                        Collection<IdeaExtraDependency> extraDependencies) {
        super(name, version, buildNumber, classes, sources, withKotlin, extraDependencies)
    }

    @Nullable
    File getIvyRepositoryDirectory() {
        version.endsWith(".SNAPSHOT") ? null : super.getIvyRepositoryDirectory()
    }
}
