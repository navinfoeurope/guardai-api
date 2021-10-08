# How to use the ASA Platform Python API client

### Install the required dependencies

```shell
pip install -r asap_api/requirements.txt
```

# Running the example code
### 1. Install the required example dependencies

```shell
pip install -r examples/requirements.txt
```

### 2. Configure the API credentials 
Edit the asap-sdk-config.yml file to configure the API connection:
```yaml
connection:
  # Ensure that the URL matches your ASA Platform deployment
  host: "https://asap.gpu.navinfo.cloud"
  # Create an API key from your ASA Platform profile
  api-key-id: "keyid"
  api-key: "key"

```
### 3. Run the sample code

#### Listing project and test information 
```shell
./examples/list_projects.py
```
#### Starting a robustness test

```shell
./examples/start_robustness_test.py
```
