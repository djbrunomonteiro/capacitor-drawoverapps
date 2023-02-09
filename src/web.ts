import { WebPlugin } from '@capacitor/core';

import type { capacitordrawoverappsPlugin } from './definitions';

export class capacitordrawoverappsWeb extends WebPlugin implements capacitordrawoverappsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
