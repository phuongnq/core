/*
 * Copyright (C) 2007-2013 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.core.xml.mergers.impl.strategies;

import java.util.Arrays;
import java.util.List;

import org.craftercms.core.service.CachingOptions;
import org.craftercms.core.service.Context;
import org.craftercms.core.xml.mergers.DescriptorMergeStrategy;
import org.craftercms.core.xml.mergers.MergeableDescriptor;

/**
 * {@link org.craftercms.core.xml.mergers.DescriptorMergeStrategy} that returns the same specified descriptor URL.
 * This means there's no need for
 * merging.
 *
 * @author Sumer Jabri
 * @author Alfonso Vásquez
 */
public class SingleFileMergeStrategy implements DescriptorMergeStrategy {

    public List<MergeableDescriptor> getDescriptors(Context context, CachingOptions cachingOptions,
                                                    String primaryDescriptorUrl) {
        return getDescriptors(context, cachingOptions, primaryDescriptorUrl, false);
    }

    public List<MergeableDescriptor> getDescriptors(Context context, CachingOptions cachingOptions,
                                                    String primaryDescriptorUrl,
                                                    boolean primaryDescriptorOptional) {
        return Arrays.asList(new MergeableDescriptor(primaryDescriptorUrl, primaryDescriptorOptional));
    }

}
